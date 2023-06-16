SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-regular-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "4f226b89dcc724cf32fa52b755900593b5b594443e5a73142d17be8114f43771ebfc2de706481ef7946a8de085eb4e414d7b571d067aa7c7210176cb8a876351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-regular-fonts \
noto-serif-hk-regular-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
