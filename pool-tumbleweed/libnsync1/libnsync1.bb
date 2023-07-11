SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync1-1.23.0-2.13.aarch64.rpm"
RPM_HASH = "49c25660b75b61987a84025f25f405b2e7a9e98626b79e6cdb5b69cad64a2642b3b2a7ddbd5684da8f2d0ded1ebc06a300a6869646fd322088f2da4fa50f2886"

RPROVIDES:${PN} += "libnsync.so.1 \
libnsync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
