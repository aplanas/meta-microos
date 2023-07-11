SUMMARY = "Support typography of l'Imprimerie Nationale Francaise"
DESCRIPTION = "The package provides useful macros implementing recommendations \
by the French Imprimerie Nationale."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn50227"

RPM_NAME = "texlive-impnattypo-2023.208.1.5svn50227-53.1.noarch.rpm"
RPM_HASH = "efd6e3f22678717e33161039e00451726297b3406f553eb8649c00ace3c74da1c00a1720353f4165bfeba5ddad3de420d7e8ea46a9652b677d55eab90b66b626"
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
