SUMMARY = "Provide a graph datastructure for experimental LaTeX3"
DESCRIPTION = "The package defines a 'graph' data structure, for use in \
documents that are using the experimental LaTeX 3 syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.9svn45913"

RPM_NAME = "texlive-lt3graph-2023.201.0.0.1.9svn45913-52.1.noarch.rpm"
RPM_HASH = "e7785340ac1bb04b813ac27430658535d43cb3a661a5796618b890924cbd8cfdbe6bfb6c41a6200f1c8be31ef669f55c84fdf8303618dfd249e77d63ed09045a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lt3graph-dry.sty) \
tex(lt3graph-packagedoc.cls) \
tex(lt3graph.sty) \
texlive-lt3graph"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(filecontents.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(l3keys2e.sty) \
tex(listings.sty) \
tex(marginnote.sty) \
tex(mdframed.sty) \
tex(needspace.sty) \
tex(noindentafter.sty) \
tex(textcomp.sty) \
tex(withargs.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
