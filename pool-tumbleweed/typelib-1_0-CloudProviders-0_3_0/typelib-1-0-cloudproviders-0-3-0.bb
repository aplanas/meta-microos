SUMMARY = "CloudProviders Introspection bindings"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools. \
 \
This package provides the GObject Introspection bindings for cloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "typelib-1_0-CloudProviders-0_3_0-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "76263dbecc1e2eb3425d6a22382c463946737e4a9eac590caa1283bac9bd9394314ace5211406eecc3b84a9698b282557c41e16402d1b37b63b74b412a0d2442"

RPROVIDES:${PN} += "typelib-1-0-CloudProviders-0-3-0 \
typelib-CloudProviders"

RDEPENDS:${PN} += "libcloudproviders.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
