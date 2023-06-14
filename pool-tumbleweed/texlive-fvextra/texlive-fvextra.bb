SUMMARY = "Extensions and patches for fancyvrb"
DESCRIPTION = "fvextra provides several extensions to fancyvrb, including \
automatic line breaking and improved math mode. It also patches \
some fancyvrb internals. Parts of fvextra were originally \
developed as part of pythontex and minted."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65158"

RPM_NAME = "texlive-fvextra-2023.201.1.5svn65158-52.1.noarch.rpm"
RPM_HASH = "85e1171d95e3e744e24df072462242d199dacbcc2d229b4e7de5193aef85f8e5ea9dba2e1e079d1f2adcc8a64ef82de4456706bb568dee6f7d6ef6af113e0941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fvextra.sty \
texlive-fvextra"

RDEPENDS:${PN} += "/bin/sh \
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
