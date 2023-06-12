SUMMARY = "Estonian language module for glossaries package"
DESCRIPTION = "This package provides the Estonian language module for the \
glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-2023.201.1.0svn49928-53.1.noarch.rpm"
RPM_HASH = "148d592698cb5e2003343874d407d9c1810fda931d77e613a198cf1e3b8f5c6e80ea39d0609a19aabb6bd3b57181e7f1fa782077d1866ac07dd694ef30a227b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-estonian-ascii.ldf) \
tex(glossaries-estonian-utf8.ldf) \
tex(glossaries-estonian.ldf) \
texlive-glossaries-estonian"
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
