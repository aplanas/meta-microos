SUMMARY = "Tools using libimobiledevice for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0+git.20210921"

RPM_NAME = "imobiledevice-tools-1.3.0+git.20210921-1.8.aarch64.rpm"
RPM_HASH = "1643afa1e66ce8aae28d54ecb1d50fb2a9009094951f672c127f5c84b824cd8546548e4d8f34c299473da2c7a3ac67eb7e5139f1e98d069fd9b5fa9e72ccae46"

RPROVIDES:${PN} += "imobiledevice-tools \
imobiledevice-tools(aarch-64) \
libimobiledevice-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libimobiledevice-1.0.so.6()(64bit) \
libimobiledevice-1_0-6 \
libimobiledevice-glue-1.0.so.0()(64bit) \
libplist-2.0.so.3()(64bit) \
libusbmuxd-2.0.so.6()(64bit)"

inherit rpm
