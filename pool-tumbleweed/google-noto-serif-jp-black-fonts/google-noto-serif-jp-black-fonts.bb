SUMMARY = "Noto Serif Japanese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Black weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-black-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "c89b758b7cf3276aacea2f972fb9091c7ca97232aee9c06f7ea3131a8ee9638a4ee8450cdaf10163f83fffb1729c6b851cc336a5556487d0e6e317f10be0f289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-black-fonts \
noto-serif-jp-black-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
