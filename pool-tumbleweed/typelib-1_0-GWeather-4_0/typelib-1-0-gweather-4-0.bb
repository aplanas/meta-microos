SUMMARY = "Introspection bindings for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
 \
This package provides the GObject Introspection bindings for the \
libgweather library."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "typelib-1_0-GWeather-4_0-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "b3b210e5e45bb3cf70c06ca8827be55153697f2fabea77b198c35a41f951f7138d2c66c81da76c25f0de1908dbb72b091c58f0572f99eda045e6d984737f780f"

RPROVIDES:${PN} += "typelib-1-0-GWeather-4-0 \
typelib-GWeather"

RDEPENDS:${PN} += "libgweather-4.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
