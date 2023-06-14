SUMMARY = "Noto Serif Korean Font - Extralight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Extralight weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-extralight-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "0e0e766f8583be37625074e14eb436a9625225f5befc7b853786bd796697f19436e690624b5e2b5181cf85a22fcd19982112d013eb760c564a6841f000fa992b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-extralight-fonts \
noto-serif-kr-extralight-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
