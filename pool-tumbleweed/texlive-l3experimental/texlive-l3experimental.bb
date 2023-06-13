SUMMARY = "Experimental LaTeX3 concepts"
DESCRIPTION = "The l3experimental packages are a collection of experimental \
implementations for aspects of the LaTeX3 kernel, dealing with \
higher-level ideas such as the Designer Interface. Some of them \
work as stand alone packages, providing new functionality, and \
can be used on top of LaTeX2e with no changes to the existing \
kernel. The present release includes: l3benchmark for measuring \
the time taken by TeX to run certain code; l3draw, a code-level \
interface for constructing drawings; l3graphics, an interfaces \
for the inclusion of graphics files; l3opacity, support for \
opacity in PDF output; l3str, support for string manipulation; \
l3bitset, support for bit vectors; l3sys-shell, which provides \
abstractions for common shell functions like file deletion and \
copying; xcoffins, which allows the alignment of boxes using a \
series of 'handle' positions, supplementing the simple TeX \
reference point; xgalley, which controls boxes receiving text \
for typesetting."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65621"

RPM_NAME = "texlive-l3experimental-2023.201.svn65621-55.1.noarch.rpm"
RPM_HASH = "3dfea2378947e4fc460dc5dc98abce052b1e31d886af14f22da8692bd1b5ef425442c96cda16138a73aaeec69c29c79521233e66bbe1f4a0ba254b49001bf9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(l3benchmark.sty) \
tex(l3bitset.sty) \
tex(l3draw.sty) \
tex(l3galley.sty) \
tex(l3graphics.sty) \
tex(l3opacity.sty) \
tex(l3str-format.sty) \
tex(l3sys-shell.sty) \
tex(xcoffins.sty) \
tex(xgalley.sty) \
texlive-l3experimental"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
