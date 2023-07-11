SUMMARY = "Small scheme (basic + xetex, metapost, a few languages)"
DESCRIPTION = "This is a small TeX Live scheme, corresponding to MacTeX's \
BasicTeX variant. It adds XeTeX, MetaPost, various \
hyphenations, and some recommended packages to scheme-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-small-2023.208.svn54191-60.1.noarch.rpm"
RPM_HASH = "f2680a28fc371782123ad4a7c407c493b3486f6ac917fb014421b1e68ac35108ad418280f278fe381ba96d72a52331b44a2422c4d6204200f929851f1f9dee0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-small"

RDEPENDS:${PN} += "texlive-babel-basque \
texlive-babel-czech \
texlive-babel-danish \
texlive-babel-dutch \
texlive-babel-english \
texlive-babel-finnish \
texlive-babel-french \
texlive-babel-german \
texlive-babel-hungarian \
texlive-babel-italian \
texlive-babel-norsk \
texlive-babel-polish \
texlive-babel-portuges \
texlive-babel-spanish \
texlive-babel-swedish \
texlive-collection-basic \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-metapost \
texlive-collection-xetex \
texlive-ec \
texlive-eurosym \
texlive-hyphen-basque \
texlive-hyphen-czech \
texlive-hyphen-danish \
texlive-hyphen-dutch \
texlive-hyphen-english \
texlive-hyphen-finnish \
texlive-hyphen-french \
texlive-hyphen-german \
texlive-hyphen-hungarian \
texlive-hyphen-italian \
texlive-hyphen-norwegian \
texlive-hyphen-polish \
texlive-hyphen-portuguese \
texlive-hyphen-spanish \
texlive-hyphen-swedish \
texlive-lm \
texlive-lualibs \
texlive-luaotfload \
texlive-luatexbase \
texlive-revtex \
texlive-synctex \
texlive-times \
texlive-tipa \
texlive-ulem \
texlive-upquote \
texlive-zapfding"

inherit rpm
