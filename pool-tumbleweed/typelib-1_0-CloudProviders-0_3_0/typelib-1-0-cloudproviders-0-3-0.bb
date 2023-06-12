SUMMARY = "CloudProviders Introspection bindings"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools. \
 \
This package provides the GObject Introspection bindings for cloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "typelib-1_0-CloudProviders-0_3_0-0.3.1-3.3.aarch64.rpm"
RPM_HASH = "4405ce1392bd9450e646b8233b38af4610b90b7df1d9b8e97cb2724feef6f951f759e3bc730993518aae947b6c66b277bf9b43290fb85283a0780a0c38dabc4a"

RPROVIDES:${PN} += "typelib(CloudProviders) \
typelib-1_0-CloudProviders-0_3_0 \
typelib-1_0-CloudProviders-0_3_0(aarch-64)"
RDEPENDS:${PN} += "libcloudproviders.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
