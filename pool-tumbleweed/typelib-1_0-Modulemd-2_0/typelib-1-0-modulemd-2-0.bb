SUMMARY = "GObject Introspection interface description for libmodulemd"
DESCRIPTION = "This package provides the GObject Introspection typelib interface \
for applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "typelib-1_0-Modulemd-2_0-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "872b5cddb917ec109960b62d549a5e9a484ea08e2d4be414ca6105ff4c9aa4d59e0f0097c1186d556a103d3ba86ad80a69d7040a3c52634100d264debc7fb911"

RPROVIDES:${PN} += "typelib-1-0-Modulemd-2-0 \
typelib-Modulemd"

RDEPENDS:${PN} += "libmodulemd.so.2 \
libmodulemd2 \
typelib-GLib \
typelib-GObject"

inherit rpm
