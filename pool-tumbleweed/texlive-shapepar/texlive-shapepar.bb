SUMMARY = "A macro to typeset paragraphs in specific shapes"
DESCRIPTION = "\\shapepar is a macro to typeset paragraphs in a specific shape. \
The size is adjusted automatically so that the entire shape is \
filled with text. There may not be displayed maths or \
'\\vadjust' material (no \\vspace) in the argument of \\shapepar. \
The macros work for both LaTeX and plain TeX. For LaTeX, \
specify \\usepackage{shapepar}; for Plain, \\input shapepar.sty. \
\\shapepar works in terms of user-defined shapes, though the \
package does provide some predefined shapes: so you can form \
any paragraph into the form of a heart by putting \
\\heartpar{sometext...} inside your document. The tedium of \
creating these polygon definitions may be alleviated by using \
the shapepatch extension to transfig which will convert xfig \
output to \\shapepar polygon form."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn30708"

RPM_NAME = "texlive-shapepar-2023.201.2.2svn30708-53.1.noarch.rpm"
RPM_HASH = "bbf9fb17a211ffee12f71d67cded0977652651da2bae3771f3b6c4b2b89180bb3bdf78014f18be2b3b7bb168a9f365471141cb79078d7bcb59720b8db26dbe79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Canflagshape.def \
tex-TeXshape.def \
tex-candleshape.def \
tex-dropshape.def \
tex-shapepar.sty \
tex-triangleshapes.def \
texlive-shapepar"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
