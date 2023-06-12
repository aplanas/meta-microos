SUMMARY = "Small scheme (basic + xetex, metapost, a few languages)"
DESCRIPTION = "This is a small TeX Live scheme, corresponding to MacTeX's \
BasicTeX variant. It adds XeTeX, MetaPost, various \
hyphenations, and some recommended packages to scheme-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54191"

RPM_NAME = "texlive-scheme-small-2023.208.svn54191-58.1.noarch.rpm"
RPM_HASH = "96bf73b553c286f26939627e0e9f3b8373be50eb52e7380cf66623fe4eed2a3a75e036db196df37dcd757fc0f9ed71150b770ccebc1591a308a57b41c7cbbaf0"
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
