SUMMARY = "WWW Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the a plugin for Remmina which allows to login and \
to browse a page."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-www-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "228eeff17f6591a183760841bd4ff1182dddd327df19739cac4355e23951294eecbfd3d07cf3a56356dbf42ffa7df0bd8590578ab4a7ed4fb1d30381e3edc2c5"

RPROVIDES:${PN} += "remmina-plugin-www \
remmina-plugin-www(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
remmina"

inherit rpm
