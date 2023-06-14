SUMMARY = "Noto Serif Simplified Chinese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Light weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-light-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "e4013778ce572995e5f42421459c381424db1d03d893a33a40de5447f111ef9e98fc0f418714c671b37725cceae325aa4b57a7c1286fd0f2a84937baad704de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-light-fonts \
noto-serif-sc-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
