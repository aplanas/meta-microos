SUMMARY = "GNOME su Library"
DESCRIPTION = "Libgnomesu is a library for providing superuser privileges to GNOME \
applications. It supports sudo, consolehelper, PAM, and su."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7"

RPM_NAME = "libgnomesu0-2.0.7-2.3.aarch64.rpm"
RPM_HASH = "533a442153f5b431f789768b36dd51a0a56038125ad774f790c17c99f8e5474227891b89a2283833bfb1382cf6a0746bf30e477a2eb5e461ad916be6954b9303"

RPROVIDES:${PN} += "libgnomesu.so.0()(64bit) \
libgnomesu0 \
libgnomesu0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnomesu \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
