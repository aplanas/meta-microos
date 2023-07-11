SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "python310-e-antic-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "439a17f4e539a48fa466363984669f42527662b962364de3cecd8f4065f6d82d54ca44a50d3c5fffbbe422c47601741734b4af2db08ff95b257369d191efeae6"

RPROVIDES:${PN} += "python3.10dist-pyeantic \
python310-e-antic \
python310-pyeantic \
python3dist-pyeantic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
