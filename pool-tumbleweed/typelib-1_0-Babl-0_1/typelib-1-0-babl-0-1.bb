SUMMARY = "Introspection bindings for babl"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
This package provides the GObject Introspection bindings for babl."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.106"

RPM_NAME = "typelib-1_0-Babl-0_1-0.1.106-1.1.aarch64.rpm"
RPM_HASH = "e6126b0abfb9bd3c73fb9dc23f37e25b1c74317970d87b618d85123d565cd96816f53c3e7ecd2b7114d7ed230c3857c5e63d948f831a3d74c3a06eb932f1fab9"

RPROVIDES:${PN} += "typelib(Babl) \
typelib-1_0-Babl-0_1 \
typelib-1_0-Babl-0_1(aarch-64)"

RDEPENDS:${PN} += "libbabl-0.1.so.0()(64bit)"

inherit rpm
