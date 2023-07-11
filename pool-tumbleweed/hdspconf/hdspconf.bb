SUMMARY = "GUI to control Hammerfall HDSP settings"
DESCRIPTION = "HDSPConf is a GUI to control the Hammerfall HDSP Alsa Settings. \
Up to four hdsp cards are supported."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "hdspconf-1.4-24.4.aarch64.rpm"
RPM_HASH = "cd27b3494a5957efd15b4e80bea0662eeac8f75652c1b15db0c64d7d488b1e0ee63fdf1d0098b1d5c97b70f7b51f1dbff852f73a2390076f055c2c1cae09c3ce"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdspconf \
hdspconf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libstdc++.so.6"

inherit rpm
