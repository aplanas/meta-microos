SUMMARY = "Noto Serif Simplified Chinese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medium weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-medium-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "dcdd925cad6ee67f9c8a99986f6fd1c53777dfa1fa01469c02f11331c1996d408bee9ce51f4e9116e4db4404d0935035d67dad3de82726ceb22b1636e08b14ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-medium-fonts \
noto-serif-sc-medium-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
