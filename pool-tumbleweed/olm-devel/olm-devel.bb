SUMMARY = "Development files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Development files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "olm-devel-3.2.14-1.6.aarch64.rpm"
RPM_HASH = "593c9d44d9754c785350af3f9a3fbce26e03682699c50f70a93c59cc297fc5a1020cc38e140e3d588aa922b7795f11cab6407ceb6107e96a4f6e0278e800285b"

RPROVIDES:${PN} += "cmake-Olm \
olm-devel \
pkgconfig-olm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libolm3"

inherit rpm
