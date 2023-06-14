SUMMARY = "GObject library, to access udev device information"
DESCRIPTION = "This package contains the GObject library libgudev, which provides \
access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "237"

RPM_NAME = "libgudev-1_0-0-237-3.1.aarch64.rpm"
RPM_HASH = "00e24e895aa28ab7c3bc6986f2070d0886bfb682b6f7f9c7750914fc0a26896fadeb42c866f4dfae459ab786145cf9154d0effe149e58ee404c35bd1d0f579f5"

RPROVIDES:${PN} += "libgudev-1-0-0 \
libgudev-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libudev.so.1"

inherit rpm
