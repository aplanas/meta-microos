SUMMARY = "Control how text gets copied from a PDF file"
DESCRIPTION = "The repltext package exposes to LaTeX a relatively obscure PDF \
feature: replacement text. When replacement text is specified \
for a piece of text, it is the replacement text, not the \
typeset text that is copied and pasted."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56433"

RPM_NAME = "texlive-repltext-2023.209.1.1svn56433-54.1.noarch.rpm"
RPM_HASH = "1997e02db7d5fd42d37da548e2a462bc791df6a9150578f28737fc99d5abf9d50e6834e54089501f6a0ec6844ea67367f1b4aafb94d8ce9a7ad69e6f591200a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-repltext.sty \
texlive-repltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
