SUMMARY = "Introspection bindings for libxmlb"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "typelib-1_0-Xmlb-1_0-0.3.11-1.1.aarch64.rpm"
RPM_HASH = "ee6be72aa6af878b9ecf871e06013a3d4042be80b87c6e16de7424e0a029dcc3a6152ab6c76e3ab01adf3b61bb3dc8068c335e6e50a053531d04adaa76864da1"

RPROVIDES:${PN} += "typelib(Xmlb) \
typelib-1_0-Xmlb-1_0 \
typelib-1_0-Xmlb-1_0(aarch-64)"

RDEPENDS:${PN} += "libxmlb.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
