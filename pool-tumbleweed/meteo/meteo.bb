SUMMARY = "Program to show the weather forecast of the next hours and days"
DESCRIPTION = "A program which displays current weather, with information about temperature, \
pressure, wind speed and direction, as well as sunrise and sunset times."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.1"

RPM_NAME = "meteo-0.9.9.1-1.11.aarch64.rpm"
RPM_HASH = "3a42f90201d39c1a815699b8b3d8a5045bf4e63234dab20cb38d6f183ca8f9424ab3a838475b5aed2b83763d722e6f69e6bfa26d9d496d8918d36c8354ee5d98"

RPROVIDES:${PN} += "meteo \
weather"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-2.4.so.1 \
libwebkit2gtk-4.0.so.37"

inherit rpm
