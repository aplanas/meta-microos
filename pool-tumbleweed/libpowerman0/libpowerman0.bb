SUMMARY = "Libraries for applications using PowerMan"
DESCRIPTION = "A shared library for applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.27"

RPM_NAME = "libpowerman0-2.3.27-1.1.aarch64.rpm"
RPM_HASH = "a4af63e0e54d9c3bfddf92f7f1d1a33916b217040909b1a48a73b70589d0ec4d796453e9040e7dca2c3fa09e050c9bb30396a204177f5bb8e222f80eef046e0d"

RPROVIDES:${PN} += "libpowerman.so.0()(64bit) \
libpowerman0 \
libpowerman0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
