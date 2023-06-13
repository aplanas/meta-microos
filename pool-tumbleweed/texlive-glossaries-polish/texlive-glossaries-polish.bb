SUMMARY = "Polish language module for glossaries package"
DESCRIPTION = "Polish language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "5302914c0b1d541936e621a4ae8463cb7da0823b1626615d81dcb179604f8fb8a4fe3f9a393df54bb8aa2fd1d73d5033e1f9543f4c213ccb455c2971f3081b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-polish-noenc.ldf) \
tex(glossaries-polish-utf8.ldf) \
tex(glossaries-polish.ldf) \
texlive-glossaries-polish"

RDEPENDS:${PN} += "/bin/sh \
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
