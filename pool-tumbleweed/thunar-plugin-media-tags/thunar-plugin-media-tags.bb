SUMMARY = "Thunar Plugin for Editing Media File Metadata and Renaming Based on Metadata"
DESCRIPTION = "The Thunar Media Tags Plugin enables editing media file metadata from within \
the Thunar file properties dialog and allows for bulk renaming based on \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "thunar-plugin-media-tags-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "7a88776765c644a127d71ebaf160783868bf5b4d67a6be12bc7ea05cd7307b3e70c2b6f0d424c22fa8c891f1b12e76574102e780aadd6ea9119a0aaffdcd1d73"

RPROVIDES:${PN} += "thunar-media-tags-plugin \
thunar-plugin-media-tags \
thunar-plugin-media-tags(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libtag_c.so.0()(64bit) \
libthunarx-3.so.0()(64bit) \
thunar"

inherit rpm
