SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "556cb4199f71335627118719283da02310c2e9ab43d937f0b8b48ec3116e0190043b41b6de9b69dd219fd0c9cd7dfe84685a5791f1b1a25fca269205c75a5839"

RPROVIDES:${PN} += "libply.so.5()(64bit) \
libply5 \
libply5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
