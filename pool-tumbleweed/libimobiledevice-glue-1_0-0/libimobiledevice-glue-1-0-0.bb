SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "A library with common code used by libraries and tools around the libimobiledevice project. \
It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0+git3.20230513"

RPM_NAME = "libimobiledevice-glue-1_0-0-1.0.0+git3.20230513-1.1.aarch64.rpm"
RPM_HASH = "47ef8bfb2e272efe36b6140ff9c6306a6e5bb5bdb0e27919ffa98b0e643be9e169cd4c4bed3a4ce7ac6e70a2fcd074b590f99e1ea95bf91a39852641f86af6bc"

RPROVIDES:${PN} += "libimobiledevice-glue-1-0-0 \
libimobiledevice-glue-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2.0.so.4"

inherit rpm
