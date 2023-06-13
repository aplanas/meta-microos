SUMMARY = "Noto Serif Simplified Chinese Font - SemiBold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SemiBold weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-semibold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "715a577007395edfa0768fc503eeeb72ed7748825321b35b4040d520b329dde3ec6fe30032884f179344e218a3ece14b72dee26821028bdfc92cea4cb3471ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-semibold-fonts \
noto-serif-sc-semibold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
