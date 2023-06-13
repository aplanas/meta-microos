SUMMARY = "Core library for toxcore"
DESCRIPTION = "This are the Core library for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "libtoxcore2-0.2.18-1.4.aarch64.rpm"
RPM_HASH = "ac5a627158a289e6fe67df76393344f82d341215a1e4898a8d79e1ecd6d6184cf030a6550ce8060c64e3477477c8371a74d6ba320aa5640fb74c0a42bf1da32d"

RPROVIDES:${PN} += "libtoxcore.so.2()(64bit) \
libtoxcore2 \
libtoxcore2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libopus.so.0()(64bit) \
libsodium.so.23()(64bit) \
libvpx.so.8()(64bit)"

inherit rpm
