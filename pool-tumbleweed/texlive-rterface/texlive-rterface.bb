SUMMARY = "Access to R analysis from within a document"
DESCRIPTION = "The package mediates interaction between LaTeX and R; it allows \
LaTeX to set R's parameters, and provides code to read R \
output."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn30084"

RPM_NAME = "texlive-rterface-2023.209.svn30084-54.1.noarch.rpm"
RPM_HASH = "40e73ad54515d3a6dae1f889cf7f2c08a4257a53af82a7a4f195fcb07fe6aa677c579721ff4e2c675e0e53f8cea28938c3e0559da9c1303f12a0caa9c59f7934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rterface.sty \
texlive-rterface"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-newfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
