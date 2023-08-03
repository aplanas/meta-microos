SUMMARY = "Automatic index generation for XeLaTeX"
DESCRIPTION = "The package is based on XeSearch, and will automatically index \
words or phrases in an XeLaTeX document. Words are declared in \
a list, and every occurrence then creates an index entry whose \
content can be fully specified beforehand."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-2023.209.0.0.3svn35756-53.1.noarch.rpm"
RPM_HASH = "28f2c194d24944c9bb3ba5d01eb05b4af1a006a001509ff04a3e2acbd7344db6459e1607a91585eb5459694e512274535d7fa540a4daa1ffbf8c2b18a5a3711e"
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
