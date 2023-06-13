SUMMARY = "GObject library, to access udev device information"
DESCRIPTION = "This package contains the GObject library libgudev, which provides \
access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "237"

RPM_NAME = "libgudev-1_0-0-237-3.1.aarch64.rpm"
RPM_HASH = "00e24e895aa28ab7c3bc6986f2070d0886bfb682b6f7f9c7750914fc0a26896fadeb42c866f4dfae459ab786145cf9154d0effe149e58ee404c35bd1d0f579f5"

RPROVIDES:${PN} += "libgudev-1.0.so.0()(64bit) \
libgudev-1_0-0 \
libgudev-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_199)(64bit)"

inherit rpm
