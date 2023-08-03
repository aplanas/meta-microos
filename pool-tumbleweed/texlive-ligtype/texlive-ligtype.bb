SUMMARY = "Comprehensive ligature suppression functionalities"
DESCRIPTION = "This package suppresses inappropriate ligatures following \
specified rules. Both font and user kerning are applied \
correctly, and f-glyphs are automatically replaced with their \
short-arm variant (if available). Also there is an emphasis on \
speed. By default the package applies German language ligature \
suppression rules. With the help of options and macros it can \
be used for other languages as well. The package requires \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn63577"

RPM_NAME = "texlive-ligtype-2023.209.0.0.1bsvn63577-55.1.noarch.rpm"
RPM_HASH = "5d2a0545d4e5c1a260807fd96832c596d0fcac70110285e4dac709af23b7cf85deb48702bb3d762a63af7ba66229e3bb0312b35d54d0475dd1ca9f1d76c3f6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ligtype.sty \
texlive-ligtype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
