SUMMARY = "Library to integrate with the GNOME Keyring"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring0-3.12.0-9.9.aarch64.rpm"
RPM_HASH = "997367a2b51bb94aec1a344b2aefd7ad574e1f49a5353b94332cef6f35ce30cc9bb42ddce45aee1d68abb661885e51b173168638ba17113096271db1ebdd3113"

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
