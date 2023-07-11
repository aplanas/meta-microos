SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-1_0-0-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "f7f133f4462d4e247a2db7cc63376f2472cea39d9208b0444c4a0ab013d627822f7ff8a4303bc73e52622dbdeaed1982e7a802314f68ca89315df6658516ec41"

RPROVIDES:${PN} += "libpeas \
libpeas-1-0-0 \
libpeas-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
