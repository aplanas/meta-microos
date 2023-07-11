SUMMARY = "Development files for gtkpod, a GUI for Apple iPods"
DESCRIPTION = "This package contains development headers for libgtkpod \
 \
gtkpod is a Platform-Independent GUI for the Apple iPod using GTK2. It \
allows you to upload songs and play lists to your iPod. It supports ID3 \
tag editing with multiple charsets for ID3 tags, detects duplicate \
songs, allows offline modification of the database with later \
synchronization, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-devel-2.1.5-6.19.aarch64.rpm"
RPM_HASH = "ec0a1b6d383f3bb6ed5f0901fecdefea94e01087cab48f7a0069aad0195a674626ff0dd02df1b03ecf336a2285e4e1a415e3ece042bdd4eb1e00f6f74e7c74e0"

RPROVIDES:${PN} += "gtkpod-devel \
pkgconfig-libgtkpod-1.1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatomicparsley0 \
libgtkpod1 \
pkgconfig-gdl-3.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libanjuta-3.0 \
pkgconfig-libgpod-1.0"

inherit rpm
