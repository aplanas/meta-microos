SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid1-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "10c4dcbbec1621bf86d78ee4cc5c8bbec5875ac208a9658dab0b177ba80b2607110d13f080791f128113caf8423f27169874874491d4f25c9b541f744e8cf523"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
