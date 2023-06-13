SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+git.20210921"

RPM_NAME = "libimobiledevice-1_0-6-1.3.0+git.20210921-1.8.aarch64.rpm"
RPM_HASH = "7f10c88d0b75178aa2ee4195a4ac9687cc7713aed43fe3273bb0a4a41265fb2a9f7a42f3a54152ce8e3e8263e0874984e4d6426762c11c83f2f9085a7972a4e7"

RPROVIDES:${PN} += "libimobiledevice-1.0.so.6()(64bit) \
libimobiledevice-1_0-6 \
libimobiledevice-1_0-6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libimobiledevice-glue-1.0.so.0()(64bit) \
libplist-2.0.so.3()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libusbmuxd-2.0.so.6()(64bit)"

inherit rpm
