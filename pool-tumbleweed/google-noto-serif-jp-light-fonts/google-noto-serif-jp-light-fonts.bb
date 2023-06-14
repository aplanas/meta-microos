SUMMARY = "Noto Serif Japanese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Light weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-light-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "f6a6a882fd43d8b061d645853b55ebfb72caa7effac6c170250a421faef1f5b6ee2a99c02929b2b446d89bb634808c5f3a602b23b767f5560d1a161ca2ebf7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-light-fonts \
noto-serif-jp-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
