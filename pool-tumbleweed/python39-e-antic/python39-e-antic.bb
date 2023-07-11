SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python39-e-antic-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "60f205373380e95c00e0a7231bc35a9e632e7970b3ea582a6f5d17439970fe39d9202bd9c02f832924e677a98eba707a430d48dbe2cac82fc414327a533a16ed"

RPROVIDES:${PN} += "python3.9dist-pyeantic \
python39-e-antic \
python39-pyeantic \
python3dist-pyeantic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
