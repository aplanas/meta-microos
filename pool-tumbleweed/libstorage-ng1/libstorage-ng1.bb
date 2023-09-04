SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng1-4.5.136-1.1.aarch64.rpm"
RPM_HASH = "368a330437dd4f593299f2a3332cdba521e6f6d70713756accace669003f57a67d596d350ba8738f0cab83c267485b8fafad58ce4df8c5f520281f1b7889d4d8"

RPROVIDES:${PN} += "libstorage-ng.so.1 \
libstorage-ng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2 \
lsscsi \
parted \
pkgconfig \
pkgconfig-udev \
util-linux"

inherit rpm
