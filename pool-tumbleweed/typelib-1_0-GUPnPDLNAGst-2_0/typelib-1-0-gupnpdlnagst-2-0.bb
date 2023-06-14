SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNAGst-2_0-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "e1227ddf2fa1b4d3b3f0d7176e4b9346b72f8e704c523198e30e30feea0f1df61981dfbad339ff7beb645719c93e6ac4a12b75c4a0de3d4b63eba87a98a83948"

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
