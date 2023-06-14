SUMMARY = "An Archive Manager for GNOME"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "file-roller-43.0-1.3.aarch64.rpm"
RPM_HASH = "3b46e27c86235545eb291de7b888857afd2997f21298b05ae727604fbd00deac992508da7d9e9933b6ad91cd5dc6b0876e864d289837c09e60c0c79794ae2f5a"

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
