SUMMARY = "Automatic index generation for XeLaTeX"
DESCRIPTION = "The package is based on XeSearch, and will automatically index \
words or phrases in an XeLaTeX document. Words are declared in \
a list, and every occurrence then creates an index entry whose \
content can be fully specified beforehand."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-2023.209.0.0.3svn35756-53.2.noarch.rpm"
RPM_HASH = "526548804b635874a583c37457bbaa0b9e4f140e08c66e9fd78bce524c6ace3630c26c50cf1b8ce1bffe16c6f4f413fc5efba16452d3e27f2883ea4ad6192f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xeindex.sty \
texlive-xeindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeidx.sty \
tex-xesearch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
