SUMMARY = "Development files for libgweather, a weather info retrieval library"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the development files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "libgweather4-devel-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "deba4ed371f39d3044226e0ba58f91ad2708b6fc568ac0932328b138ec0e1dd96c1ccb5b232bf674b8fbb14c795618b745772a650d56cf2105d8e79d94848896"

RPROVIDES:${PN} += "libgweather4-devel \
pkgconfig-gweather4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgweather-4-0 \
pkgconfig-geocode-glib-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GWeather-4-0"

inherit rpm
