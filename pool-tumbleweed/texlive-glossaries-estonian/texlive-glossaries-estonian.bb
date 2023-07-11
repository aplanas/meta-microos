SUMMARY = "Estonian language module for glossaries package"
DESCRIPTION = "This package provides the Estonian language module for the \
glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-2023.201.1.0svn49928-53.2.noarch.rpm"
RPM_HASH = "a915ef53ae7a937e0b08d3b73107ef00a60bdfa78f769d14c4ab375356dc0356638bb24e872f1a0257a6cacea8dffc57db7691044d3d47a9f4c7b56d715130c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-estonian-ascii.ldf \
tex-glossaries-estonian-utf8.ldf \
tex-glossaries-estonian.ldf \
texlive-glossaries-estonian"

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
