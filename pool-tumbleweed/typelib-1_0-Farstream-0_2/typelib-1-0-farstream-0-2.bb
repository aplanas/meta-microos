SUMMARY = "GStreamer modules and libraries for videoconferencing -- Introspection bindings"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package provides the GObject Introspection bindings for Farstream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "typelib-1_0-Farstream-0_2-0.2.9+5-2.4.aarch64.rpm"
RPM_HASH = "f354f2a3a483f451e01a8694cdbc109fea336b8a8bffab13c25957a0e22b32c27633923f69f02543aa1d5e529c9f792f917f10408e49cc62fbc3238d57055c75"

RPROVIDES:${PN} += "typelib-1-0-Farstream-0-2 \
typelib-Farstream"

RDEPENDS:${PN} += "libfarstream-0.2.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst"

inherit rpm
