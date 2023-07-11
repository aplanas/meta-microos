SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libraven0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "9110eee3a6a172d957dea1c47e3ad0f4c9b861a7a649f00df9b53c1e8c75bdf22031eabb7690018ddfb3c3af4ed99272c8fcd375d012e50bf7e5570044b67c75"

RPROVIDES:${PN} += "libraven.so.0 \
libraven0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-private.so.0 \
libbudgie-raven-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libuuid.so.1"

inherit rpm
