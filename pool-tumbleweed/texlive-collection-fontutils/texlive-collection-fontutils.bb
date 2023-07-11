SUMMARY = "Graphics and font utilities"
DESCRIPTION = "Programs for conversion between font formats, testing fonts, \
virtual fonts, .gf and .pk manipulation, mft, fontinst, etc. \
Manipulating OpenType, TrueType, Type 1,and for manipulation of \
PostScript and other image formats."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn61207"

RPM_NAME = "texlive-collection-fontutils-2023.208.svn61207-60.1.noarch.rpm"
RPM_HASH = "cfca9a099fb0cfa48211451da5822fb505ba506d52d9c83835c32e3abb9e210cc51b82e326500d522a24f4108812a30e2101c692417ced79bf0c8713643d3c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-fontutils"

RDEPENDS:${PN} += "psutils \
texlive-accfonts \
texlive-afm2pl \
texlive-albatross \
texlive-collection-basic \
texlive-dosepsbin \
texlive-dvipsconfig \
texlive-epstopdf \
texlive-fontinst \
texlive-fontools \
texlive-fontware \
texlive-lcdftypetools \
texlive-luafindfont \
texlive-metatype1 \
texlive-mf2pt1 \
texlive-ps2eps \
texlive-ps2pk \
texlive-ttfutils"

inherit rpm
