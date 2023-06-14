SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python39-hsluv-5.0.3-1.2.noarch.rpm"
RPM_HASH = "cd183feef2b592db4714d262e967f2b6a6b07385c1181cf9a3e7bc0fb81ba8eddb2c3c611db02a539391ce839ef42c0973b2937f3762475fcc92e7c155773b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hsluv \
python39-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
