SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Thin"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Thin weight of \
Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-thin-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "7d29fb1196821a587cc961a2da097a1425f2a4cecf75a34a2658ff6d3fe8d093593a38ab42a0eb890a0f11b1e855e8706fdad0f7f069bb3730a5ef63b1185df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-thin-fonts \
noto-sans-hk-thin-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
