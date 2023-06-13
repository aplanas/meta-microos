SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python310-e-antic-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "060b5ca18009964128d9d7cf9ff5a9b90a68e74878b8fd3364ce47b00b97791216cdf35a72922294eb9a950ff8ec78a3f2f3b5a1aedaa529031b092d2e20ed88"

RPROVIDES:${PN} += "python3-e-antic \
python3-pyeantic \
python3.10dist(pyeantic) \
python310-e-antic \
python310-e-antic(aarch-64) \
python310-pyeantic \
python3dist(pyeantic)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
