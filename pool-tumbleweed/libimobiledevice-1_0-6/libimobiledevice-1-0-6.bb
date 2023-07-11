SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+179git.20230430"

RPM_NAME = "libimobiledevice-1_0-6-1.3.0+179git.20230430-1.2.aarch64.rpm"
RPM_HASH = "0bf1061a6d38ff406d0a555395c427bee4dd4b1296ef83dce6f24461ff8a29d7300561c9121be936156f284185426354d10ce53398040c960322466bc1eb2853"

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
