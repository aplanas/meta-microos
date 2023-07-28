SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng1-4.5.127-1.1.aarch64.rpm"
RPM_HASH = "be53874871679adf9d7d0fbb8ca851cdb414572d785e85dd2b97a8e583220333d9ec79f8298ce4f2a5fd85e66c454f006e0d23f6783c8db873589f0e5eb76cb0"

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
