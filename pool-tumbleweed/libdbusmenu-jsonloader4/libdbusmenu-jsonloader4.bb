SUMMARY = "Small library that passes a menu structure across DBus -- Test library"
DESCRIPTION = "This package contains the shared libraries for dbusmenu-jsonloader, a library \
meant for test suites."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "7109daf8d165e1edc3be756f4470c097e7f2705c5966a2ef7c22f7d98fc61bba058ecd830965702eb1ea56053f47db8798ce9aafeb92ede5cb4504edcf4e89e2"

RPROVIDES:${PN} += "libdbusmenu-jsonloader.so.4 \
libdbusmenu-jsonloader4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
