SUMMARY = "CoreSight Trace Decode library"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "793a4c3c16fa374756b831824e809d9bdd2aeaca56e8e062bd018d7bc23e7ab7875e38d11153c562f796ecb3c23bcfe0ad42a84a69c7b19262749e29b7b1c5db"

RPROVIDES:${PN} += "OpenCSD \
OpenCSD(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopencsd.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
