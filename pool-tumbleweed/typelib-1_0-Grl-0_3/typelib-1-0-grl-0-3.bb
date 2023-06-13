SUMMARY = "Framework for browsing and searching media content -- Introspection bindings"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrl library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "typelib-1_0-Grl-0_3-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "be06d45c331ba17e980db4398a2d4bdf54c948b635b07a7cfeb4a389bc12f453abdd9df857704fb55396067063e8ab5774d13d76edb69273817927ec85c1c475"

RPROVIDES:${PN} += "typelib(Grl) \
typelib-1_0-Grl-0_3 \
typelib-1_0-Grl-0_3(aarch-64)"

RDEPENDS:${PN} += "libgrilo-0.3.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
