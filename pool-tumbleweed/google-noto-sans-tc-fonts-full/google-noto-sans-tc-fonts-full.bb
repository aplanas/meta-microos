SUMMARY = "Noto Sans Traditional Chinese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains All weights for \
Sans fonts for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-fonts-full-2.004-3.3.noarch.rpm"
RPM_HASH = "5a1f7061bef2c13c0c6c5faf841609fcc4bf513e987e5f0bc7587bb7103e82f43b1bcf46db0902d22ff1a5b22b8d380ec5095c8f6abd0165e807e95bbed2e004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-fonts-full \
noto-sans-tc-fonts-full"
RDEPENDS:${PN} += "google-noto-sans-tc-black-fonts \
google-noto-sans-tc-demilight-fonts \
google-noto-sans-tc-fonts \
google-noto-sans-tc-light-fonts \
google-noto-sans-tc-medium-fonts \
google-noto-sans-tc-thin-fonts"

inherit rpm
