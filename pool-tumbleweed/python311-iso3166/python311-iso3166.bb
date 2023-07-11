SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-iso3166-2.1.1-1.5.noarch.rpm"
RPM_HASH = "98da5dfc6668469b5c4a93795f83d3cf6b1335e68b489c4c68112ce72dcdc34d9c4c99f6818c26b031e7a4f732c11cdc840499b0e3552ba811e6d60516aca284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso3166 \
python3.11dist-iso3166 \
python311-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
