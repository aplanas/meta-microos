SUMMARY = "Visualize node lists in a tree view"
DESCRIPTION = "nodetree is a development package that visualizes the structure \
of node lists. nodetree shows its debug informations in the \
console output when you compile a LuaTeX file. It uses a \
similar visual representation for node lists as the UNIX tree \
command for a folder structure."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn65298"

RPM_NAME = "texlive-nodetree-2023.209.2.2.1svn65298-55.1.noarch.rpm"
RPM_HASH = "3f4f3581251663be9529aea3500417a3c09d54b13cbab1e5ad1206598bf9c4ebb73af5e0ef54122a3c247ec44794faa695408993bb749815a58aff52e3ad56fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nodetree-embed.sty \
tex-nodetree.sty \
tex-nodetree.tex \
texlive-nodetree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-mdframed.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
