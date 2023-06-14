SUMMARY = "Library to work with PKCS#11 modules"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "p11-kit-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "23b7e8cefb3222724de9ab6d8a88e2f424f817fde1072323b0ef8c2656ca02c2f27f348465a29aeaafef4cac049818dbfacf8aeba46b39a9c768227f10f6b138"

RPROVIDES:${PN} += "p11-kit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libp11-kit.so.0 \
libtasn1.so.6"

inherit rpm
