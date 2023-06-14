SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Extralight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Extralight weight of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-extralight-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "9fb140617e88fb7b486cc2968bb927733d4e0197d4bd1db504a283fd41601e54b426383f961e9de8b7c0288408882be6e1a1b93e75558b08e3e5d3d24f91fc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-extralight-fonts \
noto-serif-hk-extralight-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
