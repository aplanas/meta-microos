SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNAGst-2_0-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "4fa77178ea65c23a701b206bff0eb017baec3ff5ba164f1aeb01582c3ead06bcaead4ffc348db2cd6ad45385d6ed4de9ae8308899c16f91863c8e2ae1be187bc"

RPROVIDES:${PN} += "typelib-1-0-GUPnPDLNAGst-2-0 \
typelib-GUPnPDLNAGst"

RDEPENDS:${PN} += "libgupnp-dlna-gst-2.0.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GUPnPDLNA \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
