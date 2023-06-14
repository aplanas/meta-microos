SUMMARY = "Noto Serif Traditional Chinese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-regular-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "5ee95e190fea466b7c3f35beb2b5dfd7ea9fee15dc2b9f5c932164d18eb71e3501d6e056ed7b9786ca7eedaae3f535cbfae00d841f0f8f3bb4dfeabb986de695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-regular-fonts \
noto-serif-tc-regular-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
