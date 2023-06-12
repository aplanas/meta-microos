SUMMARY = "Graphics and font utilities"
DESCRIPTION = "Programs for conversion between font formats, testing fonts, \
virtual fonts, .gf and .pk manipulation, mft, fontinst, etc. \
Manipulating OpenType, TrueType, Type 1,and for manipulation of \
PostScript and other image formats."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn61207"

RPM_NAME = "texlive-collection-fontutils-2023.208.svn61207-58.1.noarch.rpm"
RPM_HASH = "73cc1d596629757a43adf13a489b525552141faf0abfa426c75ff0b2e53db9b6f26114dfa40f988686fbacd41cc22dd0555d0c256a18438e1640211113fae601"
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
