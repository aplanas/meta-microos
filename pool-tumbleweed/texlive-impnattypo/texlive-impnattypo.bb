SUMMARY = "Support typography of l'Imprimerie Nationale Francaise"
DESCRIPTION = "The package provides useful macros implementing recommendations \
by the French Imprimerie Nationale."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn50227"

RPM_NAME = "texlive-impnattypo-2023.209.1.5svn50227-54.1.noarch.rpm"
RPM_HASH = "f3e1ac93237f1924a3005aeff2da4434d84c6538a1ab2b06dd53a1b13a81bbfdd26d522939ec9f5072430ab2fab0c53549eccf3b9664bd5f1bb8f1f75ddfb537"
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
