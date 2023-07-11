SUMMARY = "Assign equation numbers to inline equations"
DESCRIPTION = "This package can assign equation numbers to inline equations. \
When Japanese is supported, you can switch to circled equation \
numbers."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-2023.208.1.2.1svn63853-53.1.noarch.rpm"
RPM_HASH = "3efa3ca7219a623cd478c329ff544100f65b09c64666de65d189fc9b63ae19b99e4e4ed56d87ac3b20d8342586aaaed80b7de14c312f1afc86975f1f0c6823f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inlinelabel.sty \
texlive-inlinelabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
