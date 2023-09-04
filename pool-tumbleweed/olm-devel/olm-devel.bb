SUMMARY = "Development files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Development files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "olm-devel-3.2.15-1.1.aarch64.rpm"
RPM_HASH = "e756478c6b452786c4e0a97de7634892ecb830b897df52b5ed2bc5578a6b840a13c6bb1ffa02344e47280cf2ff7dfd82facbc0a7d267a3fa19b13e4512f06934"

RPROVIDES:${PN} += "cmake-Olm \
olm-devel \
pkgconfig-olm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libolm3"

inherit rpm
