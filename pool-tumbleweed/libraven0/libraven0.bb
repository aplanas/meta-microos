SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libraven0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "64e9a34b847bca498f5788f44fc4f4d8b0d0e99cab9185488501bfda22bf7b4ef34aace45caab46bab13647b97b00de374c4afd9e5908c32cb8ea0f66d49811e"

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
