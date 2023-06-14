SUMMARY = "Introspection bindings for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
 \
This package provides the GObject Introspection bindings for the \
libgweather library."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "typelib-1_0-GWeather-4_0-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "6e4851d373807c6de9fc8508f619b2a35817d6fb3874c15275a6aac47dea79907efcbf8b5e62860ee0966488ad8ab70c08d8d7f1505e7617c4892d583b7af75e"

RPROVIDES:${PN} += "typelib-1-0-GWeather-4-0 \
typelib-GWeather"

RDEPENDS:${PN} += "libgweather-4.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
