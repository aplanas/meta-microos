SUMMARY = "C library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgenders0-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "2a82c3809be78e274b3de1c5e64eed766f5a5ea54ddc10708abf1678d9ed1d7caa4ac3ec5460291b1e1b209f0d1d230c36fe284e1918fe6f6f56ede7ba3f89bc"

RPROVIDES:${PN} += "libgenders.so.0()(64bit) \
libgenders0 \
libgenders0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
