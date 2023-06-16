SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Black weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-black-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "646595c58fb01cc74e03f15caa7dacdc52983a0b710532967b4604e72721a0d48296f60dddf7bacac5c159f67082dd10362abd9b913808933bd50b12126b85e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-black-fonts \
noto-serif-hk-black-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
