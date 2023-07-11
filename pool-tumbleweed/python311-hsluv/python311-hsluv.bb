SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python311-hsluv-5.0.3-1.4.noarch.rpm"
RPM_HASH = "e6fc0f3391bd9a8fc4284996a02fe46d564ec977c2a2e7cb22bb5d0680ab98b7c9905edf2ae2bc74b7db3d7de6ede02f9c34f4146e58585daf8c93473e3beeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hsluv \
python3.11dist-hsluv \
python311-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
