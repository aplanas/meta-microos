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

PV = "2023.209.1.70svn62856"

RPM_NAME = "texlive-ps2eps-2023.209.1.70svn62856-53.1.noarch.rpm"
RPM_HASH = "d7ceb00b905d9cf69ae1feb26052e123806b1387f2f8d0181938dc656d32b9464c5eedec3d9c40b843602a2409fc16a4ff1f65900543ee72b09a0169e9733814"
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
