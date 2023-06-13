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

PV = "2023.201.0.0.48svn65560"

RPM_NAME = "texlive-kpfonts-otf-2023.201.0.0.48svn65560-55.1.noarch.rpm"
RPM_HASH = "9de05897f8ced1533dc44cc1d523e954885bc64bf5ddfd72d8c7a029859cd3d69989b04a9e5708b5c170a2107b8a0af159faf67910c6304467a925c9682e87e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kpfonts-otf.sty) \
texlive-kpfonts-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(realscripts.sty) \
tex(unicode-math.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kpfonts-otf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
