SUMMARY = "Library to integrate with the GNOME Keyring -- Introspection bindings"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system. \
 \
This package provides the GObject Introspection bindings for \
libgnome-keyring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "typelib-1_0-GnomeKeyring-1_0-3.12.0-9.8.aarch64.rpm"
RPM_HASH = "e7e8a79fe201770db1e2b2ec30af6c2d2114f544b0c1e3a702164a7c62b7d698d427e52b01e6a16f7736a3866a5c0fdf7a341d3a47d314102057df2eb95aa58f"

RPROVIDES:${PN} += "typelib(GnomeKeyring) \
typelib-1_0-GnomeKeyring-1_0 \
typelib-1_0-GnomeKeyring-1_0(aarch-64)"

RDEPENDS:${PN} += "libgnome-keyring.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
