SUMMARY = "Static PAPI libraries"
DESCRIPTION = "This package includes the static PAPI libraries."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-devel-static-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "dc4b2829494d37629b4735209ef6d278c5447c28d5d89a6c6f5e1838d7d4a450a97257720f653ee34b47a8d292da7080ac4fb3822801ed861386a7bc3b9333c7"

RPROVIDES:${PN} += "papi_7_0_0-hpc-devel-static \
papi_7_0_0-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "linux-kernel-headers \
papi_7_0_0-hpc-devel"

inherit rpm
