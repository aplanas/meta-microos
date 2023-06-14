SUMMARY = "Noto Serif Traditional Chinese Font - SemiBold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SemiBold weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-semibold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "534e3fec2a8ea6c34682a0a80ac33dcc0b9cac2bd18a73e19edf5bca8f974d89b06a1f745bd6e28da40fea715d8cb6e2cd8aa79e4e4fb93d45bb4bfed4eb0f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-semibold-fonts \
noto-serif-tc-semibold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
