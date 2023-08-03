SUMMARY = "Computer Modern Type 3 fonts converted using MetaPost"
DESCRIPTION = "The Computer Modern fonts are available in Type 1 format, but \
these renditions are somewhat thin and spindly, and produce \
much lighter results than the originals. It is alternatively \
possible to use Metafont bitmaps, but this has its \
disadvantages in comparison with vector fonts. These fonts are \
conversions to Type 3 fonts, done entirely in MetaPost; they \
are vector fonts which are a direct conversion from the \
original Metafont files, so they are the design most authentic \
to the originals. However, these fonts, because they are \
PostScript Type 3 fonts, are not suitable for on-screen \
reading, and should probably only be used for printing. Note: \
do NOT add the map file to updmap!"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-mpfonts-2023.209.svn54512-55.1.noarch.rpm"
RPM_HASH = "9c903ccffe46f5c16f19b1387bbcba27223aa7fd312440b8679bee7c482ba05f8a5c8e974832c5c9cc0d4f975f058ff73cc2bb8d4200305dcc0f7a13d1d8f8e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpfonts.map \
texlive-mpfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
