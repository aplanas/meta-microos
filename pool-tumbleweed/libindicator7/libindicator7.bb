SUMMARY = "Panel indicator applet library for GTK+2"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator7-16.10.0+bzr20171205-4.15.aarch64.rpm"
RPM_HASH = "ccc8e9be721f776ec34435d3b744cd7b0802fa2c2303a05e088f05add46acbc546d98fabbd8c54159655d316c801363419aab1bb78ff90cb87c9044d4b421b7d"

RPROVIDES:${PN} += "libindicator.so.7()(64bit) \
libindicator7 \
libindicator7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
