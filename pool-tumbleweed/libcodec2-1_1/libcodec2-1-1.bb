SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "libcodec2-1_1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "7fefb96028e54efb3aae4200cb89fd1f1c1bf763b22c92d5fc92a96f74260e9a0b29b5f9b8f983467371e549a06cb94b9d29a6cd1a237942961b4130dea0d8f4"

RPROVIDES:${PN} += "libcodec2-1_1 \
libcodec2-1_1(aarch-64) \
libcodec2.so.1.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.32)(64bit)"

inherit rpm
