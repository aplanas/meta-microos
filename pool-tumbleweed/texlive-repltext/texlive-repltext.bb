SUMMARY = "Control how text gets copied from a PDF file"
DESCRIPTION = "The repltext package exposes to LaTeX a relatively obscure PDF \
feature: replacement text. When replacement text is specified \
for a piece of text, it is the replacement text, not the \
typeset text that is copied and pasted."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56433"

RPM_NAME = "texlive-repltext-2023.209.1.1svn56433-54.2.noarch.rpm"
RPM_HASH = "0a5404096d63157ad3332e0eab7a95b8ea43fea8fb7c075c4fee3b1fec0362e83f3e5c3655b2c78a0bc63a8bbec225119a399a2bab3b215ed8d2c1f8ba1897e6"
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
