SUMMARY = "GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "libgom-1_0-0-0.4-1.16.aarch64.rpm"
RPM_HASH = "fca49dd709a3ec97f998ec61eae33f3dd2e21adb1080c76489ab7ac337d617d56ee69534baf690897ef584f294951b4682a095f74540b249e5c9f733b5329791"

RPROVIDES:${PN} += "libgom-1-0-0 \
libgom-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
