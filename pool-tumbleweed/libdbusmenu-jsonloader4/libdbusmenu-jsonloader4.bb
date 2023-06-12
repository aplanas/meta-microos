SUMMARY = "Small library that passes a menu structure across DBus -- Test library"
DESCRIPTION = "This package contains the shared libraries for dbusmenu-jsonloader, a library \
meant for test suites."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "b71be967494bf16a819acffa5e50a0e0c2bb2548c79c9930c08173a6b7b5779a6740dd44ff523950d8675539ffec6d4186e88a2c197798fe1a994ee7a1709daa"

RPROVIDES:${PN} += "libdbusmenu-jsonloader.so.4()(64bit) \
libdbusmenu-jsonloader4 \
libdbusmenu-jsonloader4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit)"

inherit rpm
