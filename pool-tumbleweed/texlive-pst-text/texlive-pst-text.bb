SUMMARY = "Text and character manipulation in PSTricks"
DESCRIPTION = "Pst-text is a PSTricks based package for plotting text along a \
different path and manipulating characters. It includes the \
functionality of the old package pst-char."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn49542"

RPM_NAME = "texlive-pst-text-2023.201.1.02svn49542-53.2.noarch.rpm"
RPM_HASH = "7d020137d8c038b5383db43e8b91d8a043880383fb7d6ddffc36254d3a3f23830518d48dca4f2af9f1d976375c006740e7f1c6c61f98611f58827956a22b4c11"
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
