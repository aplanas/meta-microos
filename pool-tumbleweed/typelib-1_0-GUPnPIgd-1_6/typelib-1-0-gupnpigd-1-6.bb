SUMMARY = "Library to handle UPnP IGD port mapping -- Introspection bindings"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API. \
 \
This package provides the GObject Introspection bindings for GUPnP-IGD."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "typelib-1_0-GUPnPIgd-1_6-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "8631b011b27e7dc235c35171a58744ca8a9c79d59f6c52583dac18d69b4eb05dce0ea59f9c502760a705b9b6e4b6a9aefa574ad4ce2196752df3ab73ed36f2c7"

RPROVIDES:${PN} += "typelib(GUPnPIgd) \
typelib-1_0-GUPnPIgd-1_6 \
typelib-1_0-GUPnPIgd-1_6(aarch-64)"

RDEPENDS:${PN} += "libgupnp-igd-1.6.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
