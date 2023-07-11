SUMMARY = "C library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgenders0-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "28dfc0cfdd61cf5873874a6d756ca71ae2de398997a1365127fde4aef9f080d194afc4dd00a8a4f4d469b2a07a8ebe1f08e0c0435cf527df6a07781f55e5ba5b"

RPROVIDES:${PN} += "libgenders.so.0 \
libgenders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
