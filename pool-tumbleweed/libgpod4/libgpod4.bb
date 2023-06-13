SUMMARY = "Library to Manipulate Songs and Playlists Stored on an iPod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod4-0.8.3-12.5.aarch64.rpm"
RPM_HASH = "e04f796deef333793ff03ecc509bf172b9c621342e0eed7ad47a8192256da9430b0bc200fb1542a02b5a32c133a8f818ab524adf80bfa507e7d8bf71c0a9bd75"

RPROVIDES:${PN} += "libgpod \
libgpod.so.4()(64bit) \
libgpod4 \
libgpod4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libimobiledevice-1.0.so.6()(64bit) \
libplist-2.0.so.3()(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
