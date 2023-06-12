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

PV = "2023.201.svn54512"

RPM_NAME = "texlive-mpfonts-2023.201.svn54512-54.1.noarch.rpm"
RPM_HASH = "f5e8cfde71667ebfff50f274d6ea6d7746fd92f334e7e22944320ae1512098e296463d267d664c1167de14f6b514837115ff152abd22cdb28c47f2f9f7a665d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mpfonts.map) \
texlive-mpfonts"
RDEPENDS:${PN} += "/bin/sh \
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
