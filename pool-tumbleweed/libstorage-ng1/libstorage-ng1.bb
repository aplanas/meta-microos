SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng1-4.5.115-1.1.aarch64.rpm"
RPM_HASH = "edc0be229124ad0c80d46100ef9b1deb2c324bbad911bded6d10999fbf885e42cc857543aea5a0d926b03537ea62d19ce46562879d1ec9b77c3dbcdac3ac2db7"

RPROVIDES:${PN} += "libstorage-ng.so.1()(64bit) \
libstorage-ng1 \
libstorage-ng1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
device-mapper \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
lsscsi \
parted \
pkgconfig \
pkgconfig(udev) \
util-linux"

inherit rpm
