SUMMARY = "Simple line breaking of long formulae"
DESCRIPTION = "This package implements a simple mechanism of line/page \
breaking within the align environment of the amsmath package; \
new line characters are considered as possible candidates for \
the breaks and the package tries to put breaks at adequate \
places. It is suitable for computer-generated long formulae \
with many terms."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn43337"

RPM_NAME = "texlive-autobreak-2023.201.0.0.3svn43337-53.1.noarch.rpm"
RPM_HASH = "0f10b1a3833a4577f997e3b0c0c975203649e0ee75f76d86d7c50c5f44b00998842d34b4f073e3ed6e40d515a5034178c8c928650236cfd94ba32fff38a7003a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autobreak.sty \
texlive-autobreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-catchfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
