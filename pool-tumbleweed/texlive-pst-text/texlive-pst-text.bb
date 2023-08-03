SUMMARY = "Text and character manipulation in PSTricks"
DESCRIPTION = "Pst-text is a PSTricks based package for plotting text along a \
different path and manipulating characters. It includes the \
functionality of the old package pst-char."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn49542"

RPM_NAME = "texlive-pst-text-2023.209.1.02svn49542-54.1.noarch.rpm"
RPM_HASH = "2af44d425b51592a627492d760d72c6ac78d4823cf10fbb8bc2475e21ad8e3b70d8f7ca86eae6bcaa55e2ea19e18f80e4e630eeb423b7ff150fed2141e54d66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-char.sty \
tex-pst-text.sty \
tex-pst-text.tex \
texlive-pst-text"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
