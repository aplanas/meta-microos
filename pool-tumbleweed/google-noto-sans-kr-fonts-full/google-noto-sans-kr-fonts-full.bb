SUMMARY = "Noto Sans Korean Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains All weights for \
Sans fonts for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-fonts-full-2.004-3.3.noarch.rpm"
RPM_HASH = "d99ca3217d4da1e83279cf3cca50f2a0083bb1894b9296c51b3ad4cf11e21cdf6ccf0c96defaffe52ce013bcb6f8156db506432b1c3eef1c6075fd090a08180e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-fonts-full \
noto-sans-kr-fonts-full"

RDEPENDS:${PN} += "google-noto-sans-kr-black-fonts \
google-noto-sans-kr-demilight-fonts \
google-noto-sans-kr-fonts \
google-noto-sans-kr-light-fonts \
google-noto-sans-kr-medium-fonts \
google-noto-sans-kr-thin-fonts"

inherit rpm
