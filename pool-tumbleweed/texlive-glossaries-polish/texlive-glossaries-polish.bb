SUMMARY = "Polish language module for glossaries package"
DESCRIPTION = "Polish language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "ba08e3d968244352085db8002115b733c054471d1fa0548064ddc6fd9bd6d5a6392f5831b4e6c5a6aaee8d4ec7424c660ac87fa8ea413b6cf68ab75642a289ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-polish-noenc.ldf \
tex-glossaries-polish-utf8.ldf \
tex-glossaries-polish.ldf \
texlive-glossaries-polish"

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
