SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng1-4.5.141-1.1.aarch64.rpm"
RPM_HASH = "fc3e0a170081a8c41894e4f69ec3b164aecbfac7c23ca0c3687c6cf1bd73ec175d8c0e9a70bbc068fab4ece25e155992ef03053aae5a779be0806421da38e14f"

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
