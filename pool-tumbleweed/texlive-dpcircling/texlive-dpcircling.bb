SUMMARY = "Decorated text boxes using TikZ"
DESCRIPTION = "This simple package provides four types of text decorations \
using TikZ. You can frame your text with circles, rectangles, \
jagged rectangles, and fan-shapes. The baseline will be \
adjusted properly according to the surroundings. You can use \
these decorations both in text mode and in math mode. You can \
specify line color, line width, width, and height using option \
keys. Note: The 'DP' in the package name stands for 'Decorated \
Packets'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54994"

RPM_NAME = "texlive-dpcircling-2023.209.1.0svn54994-53.1.noarch.rpm"
RPM_HASH = "4557d9aa0b9b29f4a4a665767723bc3103fecab7c52aa8aed32a8457cbc9e78b2ebbd71485a0a0aa5d94d48b38a7361236087432e354b18bdba2484a48eb9fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DPcircling.sty \
texlive-dpcircling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
