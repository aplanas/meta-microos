SUMMARY = "Library to access RESTful web services -- Introspection bindings"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
This package provides the GObject Introspection bindings for librest."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1"

RPM_NAME = "typelib-1_0-Rest-0_7-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "5af23fefa1a53651846036fd30cc2cda267ffe62088e298c732a52ce42b1e289c2458b6b897f44e065efc819cd841b2d50627138db82df4aa8a9a4608e33cb66"

RPROVIDES:${PN} += "typelib(Rest) \
typelib(RestExtras) \
typelib-1_0-Rest-0_7 \
typelib-1_0-Rest-0_7(aarch-64)"
RDEPENDS:${PN} += "librest-0.7.so.0()(64bit) \
librest-extras-0.7.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
