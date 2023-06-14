SUMMARY = "Library to integrate with the GNOME Keyring"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring0-3.12.0-9.8.aarch64.rpm"
RPM_HASH = "16095847df7567aff623e8218357a8934be9504c5a2852cba417b91a3b0636f76a34ba6f49c19d7afa5fb6d743af5fe83d06eb94f9ac00740d534bd304fe3103"

RPROVIDES:${PN} += "libgnome-keyring \
libgnome-keyring.so.0 \
libgnome-keyring0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
