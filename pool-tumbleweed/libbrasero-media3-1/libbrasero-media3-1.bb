SUMMARY = "Brasero media utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions \
related to disc image creation and extraction, and drive handling."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-media3-1-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "a909faf02f7e4157789b0a8c0944466b85f737b8764f00c6540798ff2af42e765c3113d8b6dedd49eb39a8f44e4c845812e37b351e1ea7f5e4a225a7d5b015dc"

RPROVIDES:${PN} += "libbrasero-media3-1 \
libbrasero-media3-1(aarch-64) \
libbrasero-media3.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
