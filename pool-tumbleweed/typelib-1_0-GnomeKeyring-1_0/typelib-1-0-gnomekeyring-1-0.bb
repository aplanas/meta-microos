SUMMARY = "Library to integrate with the GNOME Keyring -- Introspection bindings"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system. \
 \
This package provides the GObject Introspection bindings for \
libgnome-keyring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "typelib-1_0-GnomeKeyring-1_0-3.12.0-9.9.aarch64.rpm"
RPM_HASH = "77cb2f842ac660afd2b93a0dfb959242e4ae7d63526c89bb7ace68176d44e6168136e35e7c0f1ee9d75932fc9e574836544ed234ded7d102379bbf67b41c4be3"

RPROVIDES:${PN} += "typelib-1-0-GnomeKeyring-1-0 \
typelib-GnomeKeyring"

RDEPENDS:${PN} += "libgnome-keyring.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
