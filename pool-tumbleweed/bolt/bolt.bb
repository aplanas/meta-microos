SUMMARY = "Thunderbolt 3 device manager"
DESCRIPTION = "Userspace system daemon to enable security levels for Thunderbolt 3 \
on GNU/Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "bolt-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "23ab8946faadefc07e2b0b3a2986de6638c6d2fa0d5193e68e7598d0a30b17f5d99e72ea7035098f0196ae5531c06a6455734df037f87178db79b9f6f76c878a"

RPROVIDES:${PN} += "bolt \
bolt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm