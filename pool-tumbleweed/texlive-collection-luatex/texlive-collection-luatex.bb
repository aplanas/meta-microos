SUMMARY = "LuaTeX packages"
DESCRIPTION = "Packages for LuaTeX, a TeX engine using Lua as an embedded \
scripting and extension language, with native support for \
Unicode, OpenType/TrueType fonts, and both PDF and DVI output. \
The LuaTeX engine itself (and plain formats) are in \
collection-basic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65791"

RPM_NAME = "texlive-collection-luatex-2023.208.svn65791-58.1.noarch.rpm"
RPM_HASH = "56af124109ef01eab152e8bf2b0f399f993c57dcbfede37c217b7b0e0beab2e006086388018c925c29fab786c003a9bf4871ee0635e9d8e02863af809ed8521f"
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
