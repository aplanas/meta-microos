SUMMARY = "An Archive Manager for GNOME"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "file-roller-43.0-1.4.aarch64.rpm"
RPM_HASH = "aeb12e420f12a311421c8e467f3523d5696ca41534c34010bdac39fc45f21aca9925ad05dad1dd9fce0b6942eeed546cd2dfcca7a1277c90d66cd1752e47dd8f"

RPROVIDES:${PN} += "file-roller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1"

inherit rpm
