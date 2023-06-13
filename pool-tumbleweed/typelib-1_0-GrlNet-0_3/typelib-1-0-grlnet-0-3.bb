SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "typelib-1_0-GrlNet-0_3-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "8de31dd1b9604b23619968775a543d1365d251d743f1f7aab3d171d09e42eda7aa2e8fb54cc0152e040267b209c05add0c8df8e18897034131131f3f194d95f6"

RPROVIDES:${PN} += "typelib(GrlNet) \
typelib-1_0-GrlNet-0_3 \
typelib-1_0-GrlNet-0_3(aarch-64)"

RDEPENDS:${PN} += "libgrlnet-0.3.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Soup)"

inherit rpm
