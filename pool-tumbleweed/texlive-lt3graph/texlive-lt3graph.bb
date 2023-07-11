SUMMARY = "Provide a graph datastructure for experimental LaTeX3"
DESCRIPTION = "The package defines a 'graph' data structure, for use in \
documents that are using the experimental LaTeX 3 syntax."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.9svn45913"

RPM_NAME = "texlive-lt3graph-2023.208.0.0.1.9svn45913-53.1.noarch.rpm"
RPM_HASH = "d59d187195bbfc14a768265ad0bd5a3b555e99e409e63293051f52ef0bf365ae2996278f64e7a75aaea2a5e67db1b86bd4c1ff8765fb9a8a2f09ef2ade32da7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3graph-dry.sty \
tex-lt3graph-packagedoc.cls \
tex-lt3graph.sty \
texlive-lt3graph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-needspace.sty \
tex-noindentafter.sty \
tex-textcomp.sty \
tex-withargs.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
