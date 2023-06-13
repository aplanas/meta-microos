SUMMARY = "Seat management library"
DESCRIPTION = "A seat management library allowing applications to use whatever seat management is available. \
Supports: seatd, (e)logind, embedded seatd for standalone operation"
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "libseat1-0.6.4-1.7.aarch64.rpm"
RPM_HASH = "44a4a795179578b112769f0f10482b10b4b6330beeb668b8b0a7a0c4b9ec0c135720238050fb5f955ac4496f7490d27c46b93a8699b1028ae745396185f5a587"

RPROVIDES:${PN} += "libseat.so.1()(64bit) \
libseat1 \
libseat1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit)"

inherit rpm
