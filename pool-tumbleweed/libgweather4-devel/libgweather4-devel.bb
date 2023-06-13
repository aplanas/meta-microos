SUMMARY = "Development files for libgweather, a weather info retrieval library"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the development files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libgweather4-devel-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "a14ce4f1e072eb822ceba2d1bb42808b747ace2ec9eb5485560b92c18d25dade7131098d322c78a23b11478472fdcca057ca92660b462333975c8ee06a611e06"

RPROVIDES:${PN} += "libgweather4-devel \
libgweather4-devel(aarch-64) \
pkgconfig(gweather4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgweather-4-0 \
pkgconfig(geocode-glib-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-GWeather-4_0"

inherit rpm
