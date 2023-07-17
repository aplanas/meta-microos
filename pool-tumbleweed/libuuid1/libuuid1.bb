SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid1-2.39-2.1.aarch64.rpm"
RPM_HASH = "dd77a579d94544f582345bb41a4beafbb00aecfc058eb78d9bf56537be203c9527575fa88097292c41e456772276ad7784fba16150767b3e8308bf15f3072569"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
