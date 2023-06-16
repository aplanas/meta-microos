SUMMARY = "A LaTeX package for testing fonts"
DESCRIPTION = "This package provides a simple way for font designers and users \
to test their fonts in different sizes without much input."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0csvn66300"

RPM_NAME = "texlive-pangram-2023.201.0.0.0csvn66300-51.1.noarch.rpm"
RPM_HASH = "2c87d8bc445ebfd88bf035cfdb25d5d79047dd7d7f81b4446b7eabbdd795a3240c5fc260d6ac2904778e28bcc148761f5a89e1615d11236ad6f8ac25eaa2e2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pangram.sty \
texlive-pangram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
