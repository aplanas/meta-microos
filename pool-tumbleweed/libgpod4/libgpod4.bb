SUMMARY = "Library to Manipulate Songs and Playlists Stored on an iPod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod4-0.8.3-12.7.aarch64.rpm"
RPM_HASH = "80554f9869fa3d33769f9f16c3ff1983cd4074b4cfa6da0706def6c5326de64691659068fc11a9da069d75c50da5cfd5ac15518e066477bd2c722f89e1bbf406"

RPROVIDES:${PN} += "libgpod \
libgpod.so.4 \
libgpod4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libsqlite3.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
