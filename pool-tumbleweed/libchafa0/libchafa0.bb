SUMMARY = "Shared library for chafa"
DESCRIPTION = "The core of Chafa which converts all kinds of images, including \
animated image formats like GIFs, into ANSI/Unicode characters."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.5"

RPM_NAME = "libchafa0-1.12.5-1.1.aarch64.rpm"
RPM_HASH = "8398a1ca13995527592ca3aa1b36479bd6f986a7481abf054e485d5971a90149c34c44d730d22cd5fabfd12cc05694d6a2c019218b7faf4c3ba05679e5217639"

RPROVIDES:${PN} += "libchafa.so.0()(64bit) \
libchafa0 \
libchafa0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
