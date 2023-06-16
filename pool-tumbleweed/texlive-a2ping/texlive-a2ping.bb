SUMMARY = "Advanced PS, PDF, EPS converter"
DESCRIPTION = "a2ping is a Perl script command line utility written for Unix \
that converts many raster image and vector graphics formats to \
EPS or PDF and other page description formats. Accepted input \
file formats are: PS (PostScript), EPS, PDF, PNG, JPEG, TIFF, \
PNM, BMP, GIF, LBM, XPM, PCX, TGA. Accepted output formats are: \
EPS, PCL5, PDF, PDF1, PBM, PGM, PPM, PS, markedEPS, markedPS, \
PNG, XWD, BMP, TIFF, JPEG, GIF, XPM. a2ping delegates the \
low-level work to Ghostscript (GS), pdftops and sam2p. a2ping \
fixes many glitches during the EPS to EPS conversion, so its \
output is often more compatible and better embeddable than its \
input."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.84psvn52964"

RPM_NAME = "texlive-a2ping-2023.201.2.84psvn52964-54.1.noarch.rpm"
RPM_HASH = "eee228e2755377a5af9548d7004c017184bc817f7526ea5c0f998dfc5f82a98452b7bba55226065831e5639ef53a328c62dd354d6881c891723a1bd34340442f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a2ping"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-a2ping-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
