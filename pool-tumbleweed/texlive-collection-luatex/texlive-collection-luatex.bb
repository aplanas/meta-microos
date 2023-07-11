SUMMARY = "LuaTeX packages"
DESCRIPTION = "Packages for LuaTeX, a TeX engine using Lua as an embedded \
scripting and extension language, with native support for \
Unicode, OpenType/TrueType fonts, and both PDF and DVI output. \
The LuaTeX engine itself (and plain formats) are in \
collection-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65791"

RPM_NAME = "texlive-collection-luatex-2023.208.svn65791-60.1.noarch.rpm"
RPM_HASH = "125c8beaa50640c24471e3933e2dcb76d81d97aa1cd6ef6940621033bf454d83586ecf06cd436899a99ccaf9760fe07b26a221b1664683ab5ffa048bf9a855d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-luatex"

RDEPENDS:${PN} += "texlive-addliga \
texlive-auto-pst-pdf-lua \
texlive-barracuda \
texlive-bezierplot \
texlive-blopentype \
texlive-checkcites \
texlive-chickenize \
texlive-chinese-jfm \
texlive-cloze \
texlive-collection-basic \
texlive-combofont \
texlive-cstypo \
texlive-ctablestack \
texlive-ekdosis \
texlive-emoji \
texlive-emojicite \
texlive-enigma \
texlive-innerscript \
texlive-interpreter \
texlive-kanaparser \
texlive-ligtype \
texlive-linebreaker \
texlive-lparse \
texlive-lt3luabridge \
texlive-lua-typo \
texlive-lua-uca \
texlive-lua-ul \
texlive-lua-uni-algos \
texlive-lua-visual-debug \
texlive-lua-widow-control \
texlive-luaaddplot \
texlive-luacas \
texlive-luacensor \
texlive-luacode \
texlive-luacolor \
texlive-luacomplex \
texlive-luagcd \
texlive-luahyphenrules \
texlive-luaimageembed \
texlive-luaindex \
texlive-luainputenc \
texlive-luaintro \
texlive-luakeys \
texlive-lualatex-doc \
texlive-lualatex-math \
texlive-lualatex-truncate \
texlive-lualibs \
texlive-lualinalg \
texlive-luamathalign \
texlive-luamaths \
texlive-luamodulartables \
texlive-luamplib \
texlive-luaoptions \
texlive-luaotfload \
texlive-luapackageloader \
texlive-luaprogtable \
texlive-luaquotes \
texlive-luarandom \
texlive-luaset \
texlive-luatex85 \
texlive-luatexbase \
texlive-luatexko \
texlive-luatextra \
texlive-luatruthtable \
texlive-luavlna \
texlive-luaxml \
texlive-lutabulartools \
texlive-minim \
texlive-minim-math \
texlive-minim-mp \
texlive-minim-pdf \
texlive-minim-xmp \
texlive-newpax \
texlive-nodetree \
texlive-odsfile \
texlive-optex \
texlive-pdfarticle \
texlive-pdfextra \
texlive-penlight \
texlive-piton \
texlive-placeat \
texlive-plantuml \
texlive-pyluatex \
texlive-scikgtex \
texlive-selnolig \
texlive-showhyphenation \
texlive-showkerning \
texlive-spacekern \
texlive-spelling \
texlive-stricttex \
texlive-truthtable \
texlive-tsvtemplate \
texlive-typewriter \
texlive-uninormalize \
texlive-yamlvars"

inherit rpm
