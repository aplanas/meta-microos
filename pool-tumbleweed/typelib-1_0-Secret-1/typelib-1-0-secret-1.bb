SUMMARY = "Introspection bindings for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus. \
 \
This package provides the GObject Introspection bindings for libsecret."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "typelib-1_0-Secret-1-0.20.5-1.8.aarch64.rpm"
RPM_HASH = "d238679066a17062a764da8f7a6f20b712b2ab1f4f0d010a998098bee48beb61bc4c0647d1263f38d7cfc421c2eac64519f177459914091bae4dc95a3c8ad338"

RPROVIDES:${PN} += "typelib-1-0-Secret-1 \
typelib-Secret"

RDEPENDS:${PN} += "libsecret-1.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
