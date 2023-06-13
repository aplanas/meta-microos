SUMMARY = "Noto Ethiopic Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-ethiopic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ad31f39ba9416f2f91d13fa5939205fa516c5701501168fb1bb2388f8503b2fbb71adda85e6f84fd0406a8cb89a6ecebe311be663861fa0de1d22cf2bca7ef44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-ethiopic \
noto-serif-ethiopic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
