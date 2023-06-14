SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libraven0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "faf126ba21f4c5740aa4e39ce85e5d5ede6ba7490c183bd085a8471074e83109b898244833987fccccd9a67535f9ec342099d04fad5b3fff0f9f29cb023db0dc"

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
