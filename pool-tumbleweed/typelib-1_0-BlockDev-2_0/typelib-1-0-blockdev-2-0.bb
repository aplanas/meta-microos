SUMMARY = "Introspection bindings for the LibBlockDev library"
DESCRIPTION = "This package provides the GObject Introspection bindings for LibBlockDev, which \
provides low-level manipulation of block devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "typelib-1_0-BlockDev-2_0-2.28-1.4.aarch64.rpm"
RPM_HASH = "2642963f9599c953b150f5ba98caebff5be3d51043776108c59cc1f4020c28ef9d65d31cd5259d5e17f0a5ba6b8f95014e8c927355dff1146566de92c180edf1"

RPROVIDES:${PN} += "typelib(BlockDev) \
typelib-1_0-BlockDev-2_0 \
typelib-1_0-BlockDev-2_0(aarch-64)"

RDEPENDS:${PN} += "libbd_utils.so.2()(64bit) \
libblockdev.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
