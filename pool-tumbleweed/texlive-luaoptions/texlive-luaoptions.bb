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

PV = "2023.201.0.0.8svn64870"

RPM_NAME = "texlive-luaoptions-2023.201.0.0.8svn64870-52.1.noarch.rpm"
RPM_HASH = "ba8d9d9841d5eb8a82ebcd364532ab9528482093f7ed4ec1c3b3fb25f834569afc9a9a7337a19b60492a92efeaaf3e3cca254f35c7c1ebf1d7aa516145c8d81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luaoptions.sty) \
texlive-luaoptions"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luaotfload.sty) \
tex(luatexbase.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
