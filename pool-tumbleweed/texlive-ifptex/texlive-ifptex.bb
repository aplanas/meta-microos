SUMMARY = "Check if the engine is pTeX or one of its derivatives"
DESCRIPTION = "The ifptex package is a counterpart of ifxetex, ifluatex, etc. \
for the ptex engine. The ifuptex package is an alias to ifptex \
provided for backward compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn62982"

RPM_NAME = "texlive-ifptex-2023.201.2.2svn62982-52.1.noarch.rpm"
RPM_HASH = "ff96474197d44642034804cb59b8254816f9255e330de6e98fe06c9022a5f7c6df3d61e666aa6cc9a44758ed7ff1d5f84e9c29e9ea3da1eeac315dc7f5b66980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifptex.sty) \
tex(ifuptex.sty) \
texlive-ifptex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
