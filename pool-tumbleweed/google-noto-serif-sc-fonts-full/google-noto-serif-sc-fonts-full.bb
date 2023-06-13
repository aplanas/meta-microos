SUMMARY = "Noto Serif Simplified Chinese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
All weights of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-fonts-full-2.001-2.3.noarch.rpm"
RPM_HASH = "da04c90eb110b426eeaad80ac9225105b014782a3f41687d566ec64d8d99588b69b3888f369654b2466725cb0b66ae5e0157494c2e7d84ad4369c3aa453c430e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-fonts-full \
noto-serif-sc-fonts-full"

RDEPENDS:${PN} += "google-noto-serif-sc-black-fonts \
google-noto-serif-sc-extralight-fonts \
google-noto-serif-sc-fonts \
google-noto-serif-sc-light-fonts \
google-noto-serif-sc-medium-fonts \
google-noto-serif-sc-semibold-fonts"

inherit rpm
