SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python311-e-antic-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "7a128ed2fb10224c7cb04e9a417915f2cc425cfa1b2aa29913d6ed15ffd4f3989330e86a65f3d9cd393f947af3eba8f27eee450f825cc2fd4b83ea4036d2c3e7"

RPROVIDES:${PN} += "python3-e-antic \
python3-pyeantic \
python3.11dist-pyeantic \
python311-e-antic \
python311-pyeantic \
python3dist-pyeantic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
