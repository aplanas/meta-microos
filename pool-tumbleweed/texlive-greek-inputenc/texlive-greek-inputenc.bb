SUMMARY = "Greek encoding support for inputenc"
DESCRIPTION = "The bundle provides UTF-8, Macintosh Greek encoding and ISO \
8859-7 definition files for use with inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-2023.209.1.8.2svn66296-54.1.noarch.rpm"
RPM_HASH = "74002539e358d6f757e41bddfd8ef476f72b540c634819689fa035d20cd6b6a685e90628a781f19639b1cb38a429751a6d74859a62d6f3816d2327661ff76d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iso-8859-7.def \
tex-macgreek.def \
texlive-greek-inputenc"

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
