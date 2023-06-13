SUMMARY = "MATE screenshot maker"
DESCRIPTION = "This is the MATE screenshot maker as shipped with the MATE utilities. \
mate-screenshot is a program which cantake desktop screenshots and \
save them."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-screenshot-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "d891f7d8548fa8793298cfc1b9f88b8f2e43a204c578ef2d7bc3b620717e6606a50bb38d30efc1fc19f3cbea369457b8dd205a1d774026d030cb43190d053880"

RPROVIDES:${PN} += "application() \
application(mate-screenshot.desktop) \
mate-screenshot \
mate-screenshot(aarch-64) \
metainfo() \
metainfo(mate-screenshot.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
