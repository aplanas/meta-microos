SUMMARY = "Geometric-style sans serif"
DESCRIPTION = "From http://andrewpaglinawan.com/category/typefaces/#quicksand: \
Quicksand is a sans serif type family of three weights plus matching \
obliques and a dash version for display and headings. Influenced by \
the geometric-style sans serif faces that were popular during the \
1920s and 30s, the fonts are based on geometric forms that have been \
optically corrected for better legibility. \
 \
Designers: Andrew Paglinawan"
LICENSE = "OFL-1.1"

PV = "1.0.20120829"

RPM_NAME = "paglinawan-quicksand-fonts-1.0.20120829-7.17.noarch.rpm"
RPM_HASH = "17d48a70f82c06865f1ef408ce950f1ae3aac7b2a430f78b14777a7c68355149b67157aeba5c145412a5e7e5b1228a1dc7d9893f1b2e61f31d5ef96936a1ffb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paglinawan-quicksand-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
