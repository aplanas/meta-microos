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

PV = "2023.201.2.71828182svn66186"

RPM_NAME = "texlive-metafont-2023.201.2.71828182svn66186-54.1.noarch.rpm"
RPM_HASH = "0a6aada97fd19c0a44ed06d20c4c1cff2c2d29443c9fc787b1b26ecf65a245d581da67c65b31296341dae56bc3eee992b6e933841d7a6f9c2b09f32bfcc4ec9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metafont-bin \
texlive-modes \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
