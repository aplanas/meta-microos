SUMMARY = "Enable integration between MetaPost pictures and LaTeX"
DESCRIPTION = "The package allows integration between MetaPost pictures and \
LaTeX. The main feature is that passing parameters to the \
MetaPost pictures is possible and the picture code can be put \
inside arguments to commands, including \\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21691"

RPM_NAME = "texlive-gmp-2023.201.1.0svn21691-53.2.noarch.rpm"
RPM_HASH = "5d5720ca161c81bca4538120674e612ce39d2881d80350e5621ed33a964b1047eae371e6f77f1e509532b65ae59afbd8cd2c4c1a2b5c331a2f70417cc74878db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmp.sty \
texlive-gmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
