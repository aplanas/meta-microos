SUMMARY = "Library for storage management"
DESCRIPTION = "This package contains libstorage-ng, a library for storage management."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng1-4.5.123-1.1.aarch64.rpm"
RPM_HASH = "fed813eac9761043786784a9a3423d2bae7ce568af63fc8a4193fb4dd69f2f302bd49eb0787433acc7be717951a757aa0727c11947e90500f2153974034136b8"

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
