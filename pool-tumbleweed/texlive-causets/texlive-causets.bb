SUMMARY = "Draw causal set (Hasse) diagrams"
DESCRIPTION = "This LaTeX package uses TikZ to generate (Hasse) diagrams for \
causal sets (causets) to be used inline with text or in \
mathematical expressions. The macros can also be used in the \
tikzpicture environment to annotate or modify a diagram, as \
shown with some examples in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66359"

RPM_NAME = "texlive-causets-2023.201.1.4svn66359-52.1.noarch.rpm"
RPM_HASH = "5ee458fe57741b920035ea6519d2c31d5e0532e5e89b0ea8ade94ae99f3504f129cfa4895f94bc737e8e97f19101bc6e0d4dabff87ad23e2a58416dffee9caa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(causets.sty) \
texlive-causets"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
