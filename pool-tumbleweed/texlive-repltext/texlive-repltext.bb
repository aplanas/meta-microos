SUMMARY = "Control how text gets copied from a PDF file"
DESCRIPTION = "The repltext package exposes to LaTeX a relatively obscure PDF \
feature: replacement text. When replacement text is specified \
for a piece of text, it is the replacement text, not the \
typeset text that is copied and pasted."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56433"

RPM_NAME = "texlive-repltext-2023.201.1.1svn56433-53.2.noarch.rpm"
RPM_HASH = "2c645575921e5df1f4e9bdf9ad90945cb3ee64a3c999b8862af894590e3fa2347d70bd00e4c6a808c22d4141d304c4e71d4de937260c9c87705756fb466aca8d"
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
