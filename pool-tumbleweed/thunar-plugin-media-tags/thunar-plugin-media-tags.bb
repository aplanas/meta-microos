SUMMARY = "Thunar Plugin for Editing Media File Metadata and Renaming Based on Metadata"
DESCRIPTION = "The Thunar Media Tags Plugin enables editing media file metadata from within \
the Thunar file properties dialog and allows for bulk renaming based on \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "thunar-plugin-media-tags-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "0b5e1e7b82af3f4fb770fd8a4415db243d329cd1aba220294211379901ff58b9dd89ace9d63859ee26f7804f95ed74c6f25ebf6dfc187744b47f57d601a0c674"

RPROVIDES:${PN} += "thunar-media-tags-plugin \
thunar-plugin-media-tags"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libtag-c.so.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
