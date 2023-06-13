SUMMARY = "Draw graph-theory graphs"
DESCRIPTION = "The package is designed to create graph diagrams as simply as \
possible, using TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-2023.201.2.0svn57484-52.1.noarch.rpm"
RPM_HASH = "dc5616eadbaf2a228a0994d79cf568b32c0ae7bf8f40527a527cbb30f6ca11c9ca44c347f8574ea808f8ff227efc05e1026dccd19f3ea058679ce671f7d365b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tkz-graph.sty) \
texlive-tkz-graph"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
