SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng1-4.5.133-1.1.aarch64.rpm"
RPM_HASH = "06536a3fae4a70f8caf4ca0f31cae590e64fa706b00ad4503219bc9d51f7f2356573809f7108b6b2c26f511bd011c13943a4ccf266dc4b4ca15ec03d4d0a6d4b"

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
