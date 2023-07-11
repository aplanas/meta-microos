SUMMARY = "Automatic index generation for XeLaTeX"
DESCRIPTION = "The package is based on XeSearch, and will automatically index \
words or phrases in an XeLaTeX document. Words are declared in \
a list, and every occurrence then creates an index entry whose \
content can be fully specified beforehand."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-2023.201.0.0.3svn35756-52.2.noarch.rpm"
RPM_HASH = "4ff3ea0418e7bd8dee6a5b5c8e91e9a740acffd7eab3bec218299f7c255984fc4b4afc0924a339194b47dfe83a3e48bb47b6f6bd125ceb85e05eb522edba16d5"
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
