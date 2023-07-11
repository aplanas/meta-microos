SUMMARY = "A platform independent GUI for the Apple® iPod® - System Library"
DESCRIPTION = "gtkpod is a Platform-Independent GUI for the Apple iPod using GTK2. It \
allows you to upload songs and play lists to your iPod. It supports ID3 \
tag editing with multiple charsets for ID3 tags, detects duplicate \
songs, allows offline modification of the database with later \
synchronization, and more. \
 \
Shared Library, to be installed by package dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "libgtkpod1-2.1.5-6.19.aarch64.rpm"
RPM_HASH = "9e86531b39c249f1b8efe3e0e7e83c04db835df2de289154f2d71491533cabec2bd148f8a46a4ce10501e370744fd0b83984c7612227003135cc0122ac88205a"

RPROVIDES:${PN} += "libgtkpod.so.1 \
libgtkpod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgtk-3.so.0 \
libwayland-server.so.0 \
libxml2.so.2"

inherit rpm
