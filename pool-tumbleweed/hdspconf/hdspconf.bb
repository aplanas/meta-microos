SUMMARY = "GUI to control Hammerfall HDSP settings"
DESCRIPTION = "HDSPConf is a GUI to control the Hammerfall HDSP Alsa Settings. \
Up to four hdsp cards are supported."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "hdspconf-1.4-24.3.aarch64.rpm"
RPM_HASH = "c219071d0c3aa25c44851c344c77e8a3759fae7f83eb82905183b615e61cba3eaad89342b955b454e7363d3e64bcfed06da3076c1168a56e05534e6ef600937a"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdspconf \
hdspconf"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libstdc++.so.6"

inherit rpm
