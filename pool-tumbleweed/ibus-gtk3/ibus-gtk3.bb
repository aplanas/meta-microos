SUMMARY = "IBus input method support for gtk3 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk3."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk3-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "78f8a49d93fa33ef6b8158ea98a54532ffb9f5c3eaf0c3181ae54435ef8e599904d568f9b81daa806cafe46cca2be6a130ab14a04c749e4f614e96be695285ae"

RPROVIDES:${PN} += "ibus-gtk3 \
ibus-gtk3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
