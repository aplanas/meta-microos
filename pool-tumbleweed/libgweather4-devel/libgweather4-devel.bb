SUMMARY = "Development files for libgweather, a weather info retrieval library"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the development files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libgweather4-devel-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "e91459f5cef66067a69738e392a13f409aa5c1dc30280b639f873f785ad76749a561e7e4d6b1cb484e157df96a59dd843647fbf35d8cd555239f761d79e5f251"

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
