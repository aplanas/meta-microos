SUMMARY = "Text and character manipulation in PSTricks"
DESCRIPTION = "Pst-text is a PSTricks based package for plotting text along a \
different path and manipulating characters. It includes the \
functionality of the old package pst-char."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn49542"

RPM_NAME = "texlive-pst-text-2023.209.1.02svn49542-54.2.noarch.rpm"
RPM_HASH = "f73066ddc709f8553ac6b835b45fd2f3d498a0c901b777c2a7f0e94f955040f767820ed5c48ee585a3ef1fe44fc60a3b2b5be6f0b9b7040520e8ce4b21da2fb4"
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
