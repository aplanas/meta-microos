SUMMARY = "Color support based on LuaTeX's node attributes"
DESCRIPTION = "This package implements color support based on LuaTeX's node \
attributes."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.17svn57829"

RPM_NAME = "texlive-luacolor-2023.208.1.17svn57829-53.1.noarch.rpm"
RPM_HASH = "2ed3dc7139912ec5c1d6a3b7d6e08daadff722ae7621e1ca5d0bc85d731253847cb514af70d885f8265ee2917bbaed0f706c02e57a0bf20362bb1a99b7fdd60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacolor.sty \
texlive-luacolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
