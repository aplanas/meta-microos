SUMMARY = "Drawing (linguistic) trees"
DESCRIPTION = "The package provides a PGF/TikZ-based mechanism for drawing \
linguistic (and other kinds of) trees. Its main features are: a \
packing algorithm which can produce very compact trees; a \
user-friendly interface consisting of the familiar bracket \
encoding of trees plus the key-value interface to \
option-setting; many tree-formatting options, with control over \
option values of individual nodes and mechanisms for their \
manipulation; the possibility to decorate the tree using the \
full power of PGF/TikZ; and an externalization mechanism \
sensitive to code-changes."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn57398"

RPM_NAME = "texlive-forest-2023.201.2.1.5svn57398-52.1.noarch.rpm"
RPM_HASH = "9dff83442f3a8449f6072b980d160a5137d8d9320024714a9f64eb9ec0c2a265c91ca6212bf10156dd18af843c1a64e4e4b3ce5060fe7eb7f91c8ddc6b5fc9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(forest-compat.sty) \
tex(forest-doc.sty) \
tex(forest-index.sty) \
tex(forest-lib-edges.sty) \
tex(forest-lib-linguistics.sty) \
tex(forest.sty) \
texlive-forest"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(dingbat.sty) \
tex(elocalloc.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(inlinedef.sty) \
tex(lstdoc.sty) \
tex(pgfkeys.sty) \
tex(pgfopts.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-elocalloc \
texlive-environ \
texlive-etoolbox \
texlive-filesystem \
texlive-inlinedef \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
