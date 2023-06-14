SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-mono-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "ab22dc35b2d27a882538a2f216b95e7fc5e2dc2b5f85df83c007964d708eee8bc17e9b9ac2fba755867eccd4d3954f67b6ac661bc461511e5270c86262072424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-mono-fonts \
noto-sans-hk-mono-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
