SUMMARY = "Account management library for GLib Applications -- Introspection Bindings"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "typelib-1_0-Accounts-1_0-1.26-1.4.aarch64.rpm"
RPM_HASH = "7a006d467c797fa3a430d5380484ede5df173279f60407d9fd060310d178dd02fdd37737716afc10879182d7eb08efb43768b82bb77a4a42a1a3f3e781cbd747"

RPROVIDES:${PN} += "typelib-1-0-Accounts-1-0 \
typelib-Accounts"

RDEPENDS:${PN} += "libaccounts-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
