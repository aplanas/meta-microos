SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Medium weight of \
Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-medium-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "bc3ee951f04d179e026faf038124e1e5cdca42fce371f6a2856213e69e51341fb92787aafa5f989ea1302b0a6f5e80f9a37a881acb3f006060b4d16cbbfa9678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-medium-fonts \
noto-sans-hk-medium-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
