SUMMARY = "A basic LuaTeX OpenType handler"
DESCRIPTION = "This is a basic LuaTeX OpenType handler, based on Paul \
Isambert's PiTeX code. It should work with Plain TeX at least."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn65441"

RPM_NAME = "texlive-blopentype-2023.201.0.0.0.0svn65441-52.1.noarch.rpm"
RPM_HASH = "ea8598d6725272a1d49ded5e0ba889887642a95e75c89403de1eaecf6697204911ce86f4ab6372b64459f8d3fa1377830e2fc7d99b7381e8a625d5bf1bb39b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blot-files.tex) \
tex(blot-fonts.tex) \
tex(blot-lua.tex) \
tex(blot.tex) \
texlive-blopentype"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gates \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texapi \
texlive-yax"

inherit rpm
