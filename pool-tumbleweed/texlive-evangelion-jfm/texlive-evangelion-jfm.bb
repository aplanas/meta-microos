SUMMARY = "A Japanese font metric supporting many advanced features"
DESCRIPTION = "This package provides a Japanese Font Metric supporting \
vertical and horizontal typesetting, 'linegap punctuations', \
'extended fonts', and more interesting and helpful features \
using traditional and simplified Chinese or Japanese fonts \
under LuaTeX-ja. It also makes full use of the 'priority' \
feature, meeting the standards, and allows easy customisation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0_bsvn65824"

RPM_NAME = "texlive-evangelion-jfm-2023.209.1.0.0_bsvn65824-53.1.noarch.rpm"
RPM_HASH = "f960568e3b90519cdc650fd30b30c85a41913b7802277fd3e1b489b2e0a2223929ce21d51dfc7889633775d6dfd67d48be89776c25d7195e8a11c7f1485622f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-evangelion-jfm"

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
