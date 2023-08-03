SUMMARY = "A LaTeX package for testing fonts"
DESCRIPTION = "This package provides a simple way for font designers and users \
to test their fonts in different sizes without much input."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0csvn66300"

RPM_NAME = "texlive-pangram-2023.209.0.0.0csvn66300-52.1.noarch.rpm"
RPM_HASH = "14df06514f3017a5fd7fd9b589965fed78ecb890d7bbe0879bc866587ac62499a1ab5c7c0e0ed69d3ba387167aebef323d32e19c585317db9bbaab2736c59eec"
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
