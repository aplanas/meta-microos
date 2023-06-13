SUMMARY = "Library for signond -- Introspection bindings"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides the GObject Introspection bindings for \
libsignon-glib library."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "typelib-1_0-Signon-2_0-2.1-1.17.aarch64.rpm"
RPM_HASH = "aad9644de359f3a9cd1b50017f61e365e5eb133a746f16cc871b9c73aa6d8e36f3e3babbc8c18e18ef74e71926e5abe9c7d77a50f148e24202a8c463e50913b7"

RPROVIDES:${PN} += "typelib(Signon) \
typelib-1_0-Signon-2_0 \
typelib-1_0-Signon-2_0(aarch-64)"

RDEPENDS:${PN} += "libsignon-glib.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
