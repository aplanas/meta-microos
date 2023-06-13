SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "typelib-1_0-GrlPls-0_3-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "c2ec88640d9dfbbf60f17495c6fe346c036be2fd7796484edcdf0ba8375a15e04cfdea4dd36ccc58977c261fe03403f6eed11adb2b7b53a76caeebb82288aa83"

RPROVIDES:${PN} += "typelib(GrlPls) \
typelib-1_0-GrlPls-0_3 \
typelib-1_0-GrlPls-0_3(aarch-64)"

RDEPENDS:${PN} += "libgrlpls-0.3.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Grl)"

inherit rpm
