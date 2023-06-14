SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "A library with common code used by libraries and tools around the libimobiledevice project. \
It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "0~git.20210925"

RPM_NAME = "libimobiledevice-glue-1_0-0-0~git.20210925-1.7.aarch64.rpm"
RPM_HASH = "9e337f15874a5792286a6f76a7d97793187192f66f60159e60b3728e0d14eaf4eb0c60f46e70797730cb44a5fe2b19d39ccd6120818f5274314219bc82ecbd69"

RPROVIDES:${PN} += "libimobiledevice-glue-1-0-0 \
libimobiledevice-glue-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2.0.so.3"

inherit rpm
