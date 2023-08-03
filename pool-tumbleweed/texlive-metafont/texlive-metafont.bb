SUMMARY = "A system for specifying fonts"
DESCRIPTION = "The program takes a programmatic specification of a font, and \
produces a bitmap font (whose properties are defined by a set \
of parameters of the target device), and metrics for use by \
TeX. The bitmap output may be converted into a format directly \
usable by a device driver, etc., by the tools provided in the \
parallel mfware distribution. Third parties have developed \
tools to convert the bitmap output to outline fonts. The \
distribution includes the source of Knuth's Metafont book; this \
source is there to read, as an example of writing TeX -- it \
should not be processed without Knuth's direct permission. The \
mailing list tex-fonts@math.utah.edu is the best for general \
discussion of Metafont usage; the tex-k@tug.org list is best \
for bug reports about building the software, etc."
LICENSE = "SUSE-TeX"

PV = "2023.209.2.71828182svn66186"

RPM_NAME = "texlive-metafont-2023.209.2.71828182svn66186-55.1.noarch.rpm"
RPM_HASH = "beac085e921927d013e42d477e8ecf3376ded2ec919461a64f740b2bf099213906a365ab83ed61f6a690bfae5a729d62f813efa75d54eddc9ef0a7ca517324d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metafont-bin \
texlive-modes \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
