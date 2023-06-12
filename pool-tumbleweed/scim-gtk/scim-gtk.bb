SUMMARY = "SCIM im module for gtk2"
DESCRIPTION = "This package contains SCIM im module for gtk2"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-gtk-1.4.18-5.10.aarch64.rpm"
RPM_HASH = "04ba669e84ea5ffe1ffad20e2ba7715a763b0d4910f0c391bb6d1507e7eeed6a6638954d918caca9e18ae74b1246835fb1cc3f5eec4aefd2b40b9f5a1d816561"

RPROVIDES:${PN} += "scim-gtk \
scim-gtk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
scim"

inherit rpm
