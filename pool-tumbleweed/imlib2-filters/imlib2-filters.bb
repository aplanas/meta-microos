SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-filters-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "b1823366e680f9fe60e8b841abbc85c829ae245f96cfe2e4a4f10d85ce038c7cda416d3f4fbfc4531f2fef9026446f5f8f24ac601befad8ee634f94ce507b96a"

RPROVIDES:${PN} += "imlib2-filters \
imlib2-filters(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2-1 \
libImlib2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
