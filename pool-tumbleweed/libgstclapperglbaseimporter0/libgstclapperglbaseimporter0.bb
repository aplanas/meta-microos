SUMMARY = "Library for clapper"
DESCRIPTION = "Library for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libgstclapperglbaseimporter0-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "a8c8c756a710eeaf6d22553bb13f8d23a6470c89de827da1de88cbfa51993123738c403458d085469fb836af29fc900f2f4e18e0936eacdda40be1ddab462ce6"

RPROVIDES:${PN} += "libgstclapperglbaseimporter.so.0 \
libgstclapperglbaseimporter0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstclapper.so \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
