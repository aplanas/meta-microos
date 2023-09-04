SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+190git.20230705"

RPM_NAME = "libimobiledevice-1_0-6-1.3.0+190git.20230705-1.1.aarch64.rpm"
RPM_HASH = "7947421c13a5b9684192f7dafaeea3531d8f34268868ade5c7baf74fe369a6f6d468dbc61f7b3068640bf5515f3d31dfa6dd323875881a7a361b880fef249d33"

RPROVIDES:${PN} += "libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libssl.so.3 \
libusbmuxd-2.0.so.6"

inherit rpm
