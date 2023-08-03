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

PV = "2023.209.2.84psvn52964"

RPM_NAME = "texlive-a2ping-2023.209.2.84psvn52964-55.1.noarch.rpm"
RPM_HASH = "213f0a92d0a13b22d20782331c9db0794d29e1f9b1b049eee35ee5ac8e6132649ebb6e08cc5bd4a9681c56da63eef7389636aeaf7fa67746ecea6c5f6d68d71c"
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
