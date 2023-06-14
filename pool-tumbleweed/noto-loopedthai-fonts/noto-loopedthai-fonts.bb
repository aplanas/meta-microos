SUMMARY = "Noto Looped Thai Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedThai font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedthai-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "476220e5054d9f86dc216f1d53006a6b7d00de731027ca3f24019f464e18b53f36a94b41a2a956c398e2c7905ad58c3aea3914dac574f78b08883f482f00a6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedthai \
noto-loopedthai-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
