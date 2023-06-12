SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libraven0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "faf126ba21f4c5740aa4e39ce85e5d5ede6ba7490c183bd085a8471074e83109b898244833987fccccd9a67535f9ec342099d04fad5b3fff0f9f29cb023db0dc"

RPROVIDES:${PN} += "libraven.so.0()(64bit) \
libraven0 \
libraven0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbudgie-private.so.0()(64bit) \
libbudgie-raven-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
