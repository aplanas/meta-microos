SUMMARY = "CloudProviders Introspection bindings"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools. \
 \
This package provides the GObject Introspection bindings for cloudproviders."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "typelib-1_0-CloudProviders-0_3_0-0.3.1-3.4.aarch64.rpm"
RPM_HASH = "7a2aca637d1cffcd1219c2dc48b28bc89d921c2256a4f30f517004d1aaa771bf0bd7ddb7e1d66f0f7de746446b3c589bd0c0205e870b217a22b9b0f68e8a8a5f"

RPROVIDES:${PN} += "typelib-1-0-CloudProviders-0-3-0 \
typelib-CloudProviders"

RDEPENDS:${PN} += "libcloudproviders.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
