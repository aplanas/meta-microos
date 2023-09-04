SUMMARY = "Introspection bindings for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
 \
This package provides the GObject Introspection bindings for the \
libgweather library."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "typelib-1_0-GWeather-4_0-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "be4ce4cebc6af8dc1915169f5f086f11e8e15b441bcc4d1438cdf1f44326ecbeb422a8afb8c1d820d58b31b38201cbc612abf7e509630d5009a3fdcb90153525"

RPROVIDES:${PN} += "typelib-1-0-GWeather-4-0 \
typelib-GWeather"

RDEPENDS:${PN} += "libgweather-4.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
