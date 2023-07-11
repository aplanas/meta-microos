SUMMARY = "Check if the engine is pTeX or one of its derivatives"
DESCRIPTION = "The ifptex package is a counterpart of ifxetex, ifluatex, etc. \
for the ptex engine. The ifuptex package is an alias to ifptex \
provided for backward compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.2svn62982"

RPM_NAME = "texlive-ifptex-2023.208.2.2svn62982-53.1.noarch.rpm"
RPM_HASH = "03dbdeb97b12fee59974cc94921a2d934b2b3a9570a2c6989385679eee971d8b60f5cddffb45a5aa67964f2b7eca315a55d68ca5e8d72878722de4605910a70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifptex.sty \
tex-ifuptex.sty \
texlive-ifptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
