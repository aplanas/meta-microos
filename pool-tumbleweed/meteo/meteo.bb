SUMMARY = "Program to show the weather forecast of the next hours and days"
DESCRIPTION = "A program which displays current weather, with information about temperature, \
pressure, wind speed and direction, as well as sunrise and sunset times."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.2"

RPM_NAME = "meteo-0.9.9.2-1.1.aarch64.rpm"
RPM_HASH = "dcfe3131183031e97a8149955453a77b09eaaca1211d37b88162cf225576fa5bd47b2c1e37453a701e60801cc0f511aad0aae1dafd67a1e25fa2e31caa5e8f51"

RPROVIDES:${PN} += "meteo"

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
