SUMMARY = "Simple atom representation according to the Bohr model"
DESCRIPTION = "The package provides means for the creation of simple Bohr \
models of atoms up to the atomic number 112. In addition, \
commands are provided to convert atomic numbers to element \
symbols or element names and vice versa."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62977"

RPM_NAME = "texlive-bohr-2023.209.1.0svn62977-53.1.noarch.rpm"
RPM_HASH = "896d4908295eb2cdba7b11b25dd39540024c6151b8336f47b2d0e88c42ff1390cf0207ba01e33d8770216cd934b3774652a2aa24d2f0ff413d29a3d13b84ce54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bohr.sty \
texlive-bohr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-elements.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
