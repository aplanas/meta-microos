SUMMARY = "A library to manage subordinate uid and gid ranges"
DESCRIPTION = "Utility library that provides a way to manage subid ranges."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "libsubid4-4.14.0-1.1.aarch64.rpm"
RPM_HASH = "7500eff551447c9afa22e462920c028e4e7d12d473859ed10d0e2d46aa15c6ec00f9e9c1dd9ea7973708c6ac78ef8b98e3cc8594af9251decf8014b0faad57d6"

RPROVIDES:${PN} += "libsubid.so.4 \
libsubid4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
