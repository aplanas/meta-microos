SUMMARY = "Library for clapper"
DESCRIPTION = "Library for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libgstclapperglbaseimporter0-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "aad754eb23d0b5f636a16ded24ca2a56ea53d50e4251fef3854c7e72fccb8de50ec7e58d82a586a9175b841039fc55ad0d16570f5aa212e28daa11560727eb86"

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
