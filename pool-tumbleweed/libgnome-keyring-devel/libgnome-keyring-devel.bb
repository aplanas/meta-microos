SUMMARY = "Library to integrate with the GNOME Keyring - Development Files"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring-devel-3.12.0-9.8.aarch64.rpm"
RPM_HASH = "306c76793acf657f6360c07abd68bfb38af0c1dbc46a6df2acb94b3d810f07559f165b2cf5c4ac9ccd7e20220e5736a63bb574c5025369dc3ccf32ea7758c960"

RPROVIDES:${PN} += "gnome-keyring-devel \
gnome-keyring-doc \
libgnome-keyring-devel \
libgnome-keyring-devel(aarch-64) \
pkgconfig(gnome-keyring-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-keyring0 \
pkgconfig(glib-2.0) \
typelib-1_0-GnomeKeyring-1_0"

inherit rpm
