SUMMARY = "Support typography of l'Imprimerie Nationale Francaise"
DESCRIPTION = "The package provides useful macros implementing recommendations \
by the French Imprimerie Nationale."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn50227"

RPM_NAME = "texlive-impnattypo-2023.201.1.5svn50227-52.1.noarch.rpm"
RPM_HASH = "e684e8c59ebfa7a92761c51a69852864e5f83474d7e08e15177349ea5868810f86c622f0c2aed692071311d7c26deeb31e00b298331034a92a7c95e5e3120cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-impnattypo.sty \
texlive-impnattypo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
