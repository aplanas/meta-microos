SUMMARY = "Library to integrate with the GNOME Keyring - Development Files"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring-devel-3.12.0-9.9.aarch64.rpm"
RPM_HASH = "05829e44e922801b92fe4bc36bb790577eebe8868b3101eef5a38327cb695131fe8416546d5d0986f71930941916a3bfc6d9ec916f588d0cfb86b993f0a4e2e7"

RPROVIDES:${PN} += "gnome-keyring-devel \
gnome-keyring-doc \
libgnome-keyring-devel \
pkgconfig-gnome-keyring-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-keyring0 \
pkgconfig-glib-2.0 \
typelib-1-0-GnomeKeyring-1-0"

inherit rpm
