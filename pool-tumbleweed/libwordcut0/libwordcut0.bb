SUMMARY = "Thai word segmentation utility"
DESCRIPTION = "Thai word segmentation utility."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "libwordcut0-0.5.1b2-205.7.aarch64.rpm"
RPM_HASH = "da7a018e740ae5d666d5b1f5022026261f73d1d6c91837a17d93db6250adc9f0f67cb89cbbfee10d163f2cb893b47255ef389afd45d0a9dcf6c0c1bdfc3e9ef3"

RPROVIDES:${PN} += "libwordcut.so.0 \
libwordcut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
