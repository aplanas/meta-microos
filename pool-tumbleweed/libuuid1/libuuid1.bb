SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid1-2.39-3.1.aarch64.rpm"
RPM_HASH = "62628dfd90ee9d91cb0ac8608f29fcd2e2598153d4a843a2b2569c799313379d345f9fd95fba14ada957a9dc4bd0f25fca4e8e0578aa92b46eaa72c2822e4172"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
