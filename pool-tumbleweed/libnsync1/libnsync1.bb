SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync1-1.23.0-2.12.aarch64.rpm"
RPM_HASH = "2f64021b21dd07320ee44a17c4e043f7c214dfb3c25e0a123c60321c11e4c57cecea8c1ea5fc11956e0bb8a6e9fb8627703c4649135affc0556dcc006e1158f7"

RPROVIDES:${PN} += "libnsync.so.1()(64bit) \
libnsync1 \
libnsync1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
