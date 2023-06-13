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

RPM_NAME = "libgtkpod1-2.1.5-6.18.aarch64.rpm"
RPM_HASH = "274d4c429eb5dab2674fc86b6d790b5c6bddce80e89ae2b3cf4d0b87b86d060a1df8d9046383901b9774d8e719656fab9a5aab7306bc16480f31901a2d03ea77"

RPROVIDES:${PN} += "libgtkpod.so.1()(64bit) \
libgtkpod1 \
libgtkpod1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpod.so.4()(64bit) \
libgtk-3.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
