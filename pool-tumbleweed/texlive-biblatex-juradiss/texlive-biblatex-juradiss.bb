SUMMARY = "BibLaTeX stylefiles for German law theses"
DESCRIPTION = "The package provides a custom citation-style for typesetting a \
German law thesis with LaTeX. The package (using BibLaTeX) is \
based on biblatex-dw and uses biber."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.23svn56502"

RPM_NAME = "texlive-biblatex-juradiss-2023.209.0.0.23svn56502-54.1.noarch.rpm"
RPM_HASH = "0e5e46e8386b225e16306c295bb3c6312b93c988379e03f4cff9fa78c7fd023a542c75327f1dadb9d46d9684903c3a53cb61970077e28652e5a3abfd5eaabcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-juradiss.bbx \
tex-biblatex-juradiss.cbx \
texlive-biblatex-juradiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle-dw.bbx \
tex-authortitle-dw.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
