SUMMARY = "GObject Introspection interface description for libmodulemd"
DESCRIPTION = "This package provides the GObject Introspection typelib interface \
for applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "typelib-1_0-Modulemd-2_0-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "4b18285f585898983db2fc926ee3a774d15e4e117757b845fcec56ab17c2d9b4ee3b588e3b6799d1766aa7d60553b52c2fc25eaa6e2e3145066d1acca7a29efd"

RPROVIDES:${PN} += "typelib(Modulemd) \
typelib-1_0-Modulemd-2_0 \
typelib-1_0-Modulemd-2_0(aarch-64)"

RDEPENDS:${PN} += "libmodulemd.so.2()(64bit) \
libmodulemd2(aarch-64) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
