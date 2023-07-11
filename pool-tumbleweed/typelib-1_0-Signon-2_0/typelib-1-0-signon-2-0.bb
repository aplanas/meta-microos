SUMMARY = "Library for signond -- Introspection bindings"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides the GObject Introspection bindings for \
libsignon-glib library."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "typelib-1_0-Signon-2_0-2.1-1.18.aarch64.rpm"
RPM_HASH = "426265ddc54b754847e3c5d7710d26a095c8ba6f3c2c6924e3621f98b5dfc3d51272cc2dd7829c6414db44c04d4807fa28e8f17ed58fde19b34f7bc560d59334"

RPROVIDES:${PN} += "typelib-1-0-Signon-2-0 \
typelib-Signon"

RDEPENDS:${PN} += "libsignon-glib.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
