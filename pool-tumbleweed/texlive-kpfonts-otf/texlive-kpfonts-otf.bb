SUMMARY = "OTF version of the Kp-fonts"
DESCRIPTION = "This bundle provides OpenType versions of the Type1 Kp-fonts \
designed by Christophe Caignaert. It is usable with LuaTeX or \
XeTeX engines only. It consists of sixteen Text fonts (eight \
Serif, four Sans-Serif, four Monotype) and six Math fonts. \
Serif and Sans-Serif families have small caps available in two \
sizes (SmallCaps and PetitesCaps), upper and lowercase digits, \
real superscripts and subscripts; ancient ligatures (ct and \
st), ancient long-s and a long-tailed capital Q are available \
via font features. Math fonts cover all usual symbols including \
AMS'; a full list of available symbols is provided, see the \
'List of glyphs'."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.48svn65560"

RPM_NAME = "texlive-kpfonts-otf-2023.209.0.0.48svn65560-56.1.noarch.rpm"
RPM_HASH = "d91793c0cf552abb11cc10e8594c5572d24cad5ce7ade0229d28e79ab95c0d7bd542eb7cc4158398c72eb18c19b1c2f740890a0572a26ff4a3bf1ed1df3fcab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kpfonts-otf.sty \
texlive-kpfonts-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kpfonts-otf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
