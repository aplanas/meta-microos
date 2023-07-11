SUMMARY = "Option handling for LuaLaTeX packages"
DESCRIPTION = "This LuaLaTeX package provides extensive support for handling \
options, on package level and locally. It allows the \
declaration of sets of options, along with defaults, \
expected/allowed values and limited type checking. These \
options can be enforced as package options, changed at any \
point during a document, or overwritten locally by optional \
macro arguments. It is also possible to instantiate an Options \
object as an independent Lua object, without linking it to a \
package. Luaoptions can be used to enforce and prepopulate \
options, or it can be used to simply handle the parsing of \
optional key=value arguments into proper Lua tables."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.8svn64870"

RPM_NAME = "texlive-luaoptions-2023.208.0.0.8svn64870-53.1.noarch.rpm"
RPM_HASH = "7b6f9be9330924e4b16f641fab257a16f784172f823fd2ebdd619fa715b2b6ec54dbb26caa4863cb6e37fe196602f7baf510462c3d843ed43a39f6dc21803eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaoptions.sty \
texlive-luaoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luaotfload.sty \
tex-luatexbase.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
