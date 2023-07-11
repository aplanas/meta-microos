SUMMARY = "OpenType 'loader' for Plain TeX and LaTeX"
DESCRIPTION = "The package adopts the TrueType/OpenType Font loader code \
provided in ConTeXt, and adapts it to use in Plain TeX and \
LaTeX. It works under LuaLaTeX only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.3.23svn64616"

RPM_NAME = "texlive-luaotfload-2023.208.3.23svn64616-53.1.noarch.rpm"
RPM_HASH = "7db488c5b7cef1f96abbb223d1f8b32f231149e3c7010910e21f39239f87bab9d66b578360d7b1e0afc7bd6e85115d91a31fda72d78d94f3361b1d1e5de20dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaotfload-blacklist.cnf \
tex-luaotfload.sty \
texlive-luaotfload"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm \
texlive-lua-alt-getopt \
texlive-lua-uni-algos \
texlive-lualibs \
texlive-luaotfload-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
