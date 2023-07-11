SUMMARY = "Simple Movie Player"
DESCRIPTION = "pia is a simple movie player which can playback AVI and QuickTime \
movies recorded by xawtv, motv, and streamer. Other movies might work \
as well."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "pia-3.107-2.11.aarch64.rpm"
RPM_HASH = "5ce69847ab912bf250fa13410351271bdccd07056fb22ddcf2f8d4144aab5bf826f57dc7090bc0e4b04e2f0c4dd7e6c7c25917c1ef18cd589294d1a5230a2df5"

RPROVIDES:${PN} += "pia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libXv.so.1 \
libc.so.6 \
libjpeg.so.8 \
tv-common"

inherit rpm
