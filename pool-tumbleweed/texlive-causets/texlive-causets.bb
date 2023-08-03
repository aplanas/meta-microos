SUMMARY = "Draw causal set (Hasse) diagrams"
DESCRIPTION = "This LaTeX package uses TikZ to generate (Hasse) diagrams for \
causal sets (causets) to be used inline with text or in \
mathematical expressions. The macros can also be used in the \
tikzpicture environment to annotate or modify a diagram, as \
shown with some examples in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66359"

RPM_NAME = "texlive-causets-2023.209.1.4svn66359-53.1.noarch.rpm"
RPM_HASH = "fea70e3be77fd5f3872fdb9be12afeb3a7914d578b597eabe3cde033e3d5b4a2f19ec9841dff5bffeb11f6b2c3e741507ae36334cd391fa6dd344083581cf71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-causets.sty \
texlive-causets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
