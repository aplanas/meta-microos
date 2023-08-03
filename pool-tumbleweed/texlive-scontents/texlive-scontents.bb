SUMMARY = "Stores LaTeX contents in memory or files"
DESCRIPTION = "This package stores valid LaTeX code in memory (sequences) \
using the l3seq module of expl3. The stored content (including \
verbatim) can be used as many times as desired in the document, \
additionally can be written to external files if desired."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62902"

RPM_NAME = "texlive-scontents-2023.209.2.0svn62902-54.1.noarch.rpm"
RPM_HASH = "a39ce5c1ddd50b9d055229d30629d9b0deaa94b9cd5daf7f802e3e99605bfd042eb892951797aa75e2e1388edcbb0c47c045d2e0254584e71c9229cbbff5f28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scontents-code.tex \
tex-scontents.sty \
tex-scontents.tex \
texlive-scontents"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
