SUMMARY = "Noto Serif Traditional Chinese Font - Extralight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Extralight weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-extralight-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "f111330f07de967778df413e5c1084b996c38d969dc8c289ea7951505818ab0f2052cd09933b2a4929500eef0204597ccfac320f5b26456cb5651cf6a977e382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-extralight-fonts \
noto-serif-tc-extralight-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
