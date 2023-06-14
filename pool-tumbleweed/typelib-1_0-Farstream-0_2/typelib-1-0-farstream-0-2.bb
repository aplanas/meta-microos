SUMMARY = "GStreamer modules and libraries for videoconferencing -- Introspection bindings"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package provides the GObject Introspection bindings for Farstream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "typelib-1_0-Farstream-0_2-0.2.9+5-2.3.aarch64.rpm"
RPM_HASH = "9074f0bd13c62852b5482c74d69e44fc77301e05a95351039e50dda7766cc62200f433cae2b64218599f0552b9c171bafa2e7e97b9f9d8606d46780b49c81cea"

RPROVIDES:${PN} += "typelib-1-0-Farstream-0-2 \
typelib-Farstream"

RDEPENDS:${PN} += "libfarstream-0.2.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
