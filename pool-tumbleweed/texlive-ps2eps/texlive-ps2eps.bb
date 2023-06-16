SUMMARY = "Produce Encapsulated PostScript from PostScript"
DESCRIPTION = "Produce Encapsulated PostScript Files (EPS/EPSF) from a \
one-page PostScript document, or any PostScript document. A \
correct Bounding Box is calculated for the EPS files and some \
PostScript command sequences that can produce errorneous \
results on printers are filtered. The input is cropped to \
include just the image contained in the PostScript file. The \
EPS files can then be included into TeX documents. Other \
programs like ps2epsi (a script distributed with ghostscript) \
don't always calculate the correct bounding box (because the \
values are put on the PostScript stack which may get corrupted \
by bad PostScript code) or they round it off, resulting in \
clipping the image. Therefore ps2eps uses a resolution of 144 \
dpi to get the correct bounding box. The bundle includes \
binaries for Linux, Solaris, Digital Unix or Windows \
2000/9x/NT; for other platforms, the user needs perl, \
ghostscript and an ANSI-C compiler. Included in the \
distribution is the bbox program, an application to produce \
Bounding Box values for rawppm or rawpbm format files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.70svn62856"

RPM_NAME = "texlive-ps2eps-2023.201.1.70svn62856-52.1.noarch.rpm"
RPM_HASH = "b5a9ab08ba148839e82093bbbc6ae1aa7eb0f2a94b774ecac5f4d6e765ed2869e4faddfb3465eaabe696d93c81fa997efec3eff60713c5eadb29b457bf3ddab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ps2eps \
texlive-pstools-/usr/share/texmf/scripts/ps2eps/ps2eps.pl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-POSIX \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ps2eps-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
