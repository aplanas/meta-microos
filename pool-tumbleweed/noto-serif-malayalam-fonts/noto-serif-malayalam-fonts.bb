SUMMARY = "Noto Malayalam Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-malayalam-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d218fccbff6dff3cb07c666545d1391dfb8d5a3ccbec578259d12deabdc0b4b019709f37d0858450abf8487c211cee04408729176f8122d028b4e262dccad1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-malayalam \
noto-serif-malayalam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
