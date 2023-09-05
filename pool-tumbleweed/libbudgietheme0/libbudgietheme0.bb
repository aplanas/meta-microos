SUMMARY = "Shared library for Budgie theming"
DESCRIPTION = "Budgie theming engine shared library package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libbudgietheme0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "f625c6790879c6cec6058615e825b8ba0cfa7049aea28df0dc67bc0b309f89da7030592ce18be5d81d05ef741be0b2c343bb5fcb1b36f544e63db93924805eb4"

RPROVIDES:${PN} += "libbudgietheme.so.0 \
libbudgietheme0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
