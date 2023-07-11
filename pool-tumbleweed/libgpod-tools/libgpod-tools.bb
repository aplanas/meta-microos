SUMMARY = "Tools for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package includes support tools for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-tools-0.8.3-12.7.aarch64.rpm"
RPM_HASH = "4d0858feb97ec5a2a2977dfff5de24bd79150f3ec292ea62daa6fda755896f8f1a5ca4bae214851cfc871c2ee929d2be6391529bb6fead7864441e9909f2b338"

RPROVIDES:${PN} += "libgpod-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libsgutils2-1.48.so.2 \
libusb-1.0.so.0 \
libxml2.so.2"

inherit rpm
