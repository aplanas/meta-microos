SUMMARY = "Extensions and patches for fancyvrb"
DESCRIPTION = "fvextra provides several extensions to fancyvrb, including \
automatic line breaking and improved math mode. It also patches \
some fancyvrb internals. Parts of fvextra were originally \
developed as part of pythontex and minted."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65158"

RPM_NAME = "texlive-fvextra-2023.209.1.5svn65158-53.1.noarch.rpm"
RPM_HASH = "e2397e75e9881e15626c54de46cd869ffcff2d229e06e56594b61ec05454eb8ba6ec06740084295b41a289bc5904efa85a7cd653cef0af08120de29b5545dfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fvextra.sty \
texlive-fvextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-lineno.sty \
tex-textcomp.sty \
tex-upquote.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
