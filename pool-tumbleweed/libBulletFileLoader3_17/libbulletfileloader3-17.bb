SUMMARY = "Bullet File Loader Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletFileLoader3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "0a79cba091cc303474fe8f4292269c1f171a3749745cd718d795010eaf1432e345afc88a5a0baae5aa0a9592660c138b18971690adaf9ee5f1860f47e6343742"

RPROVIDES:${PN} += "libBulletFileLoader.so.3.17 \
libBulletFileLoader3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
