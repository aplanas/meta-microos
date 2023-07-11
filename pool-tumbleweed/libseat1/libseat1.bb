SUMMARY = "Seat management library"
DESCRIPTION = "A seat management library allowing applications to use whatever seat management is available. \
Supports: seatd, (e)logind, embedded seatd for standalone operation"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "libseat1-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "e93bcf7e2837a05be2efc131ffc9ae328ff8702dac7e746c03f11bb8a9097b64e8ad2e66210d9c2a4d0f7f863420e1ae9afe9cedba5c8b4bc54f821fceeceeab"

RPROVIDES:${PN} += "libseat.so.1 \
libseat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
