SUMMARY = "Bullet File Loader Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletFileLoader3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "1cf92c0bdc5618df2b5462107cdb5e7057f926963eca0b2ecb5e198aa102ce323149d6c6b758bb2e67e2ad6dce026fdcf3a881ad879584642bac19d234752b75"

RPROVIDES:${PN} += "libBulletFileLoader.so.3.17 \
libBulletFileLoader3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
