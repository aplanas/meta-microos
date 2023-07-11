SUMMARY = "File-roller extension for Nautilus"
DESCRIPTION = "File Roller is an archive manager for GNOME. With it, you can create \
and modify archives, view the contents of an archive, view a file \
contained in the archive, and extract files from the archive."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "nautilus-file-roller-43.0-1.4.aarch64.rpm"
RPM_HASH = "8367bb42f0604862b5247126affc4fce78e471fdd3dd69261edcd9d4c12646cce5e48ea4bcc60422e9c8cb881ce8c0c488b1542e8fcd88b92f9c0161efcd9b0d"

RPROVIDES:${PN} += "libnautilus-fileroller.so \
nautilus-file-roller"

RDEPENDS:${PN} += "file-roller \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
nautilus"

inherit rpm
