SUMMARY = "Video4Linux TV application (Athena)"
DESCRIPTION = "xawtv is an X11 application for watching TV with your Linux box. It supports \
video4linux devices (for example bttv cards, various USB webcams, ...). It uses \
the Athena widgets."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "xawtv-3.107-2.11.aarch64.rpm"
RPM_HASH = "aed61ff8bc94a678f628ead6a81fe1770e3bd86bfcd3cac40fcf0bc72ee4ff771406700f44db28400bbdd856939dda27d19c12c787b404196686a5edd55f92e6"

RPROVIDES:${PN} += "xawtv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXt.so.6 \
libXv.so.1 \
libXxf86dga.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
liblirc-client.so.0 \
libm.so.6 \
libzvbi.so.0 \
tv-common \
tv-fonts \
v4l-conf"

inherit rpm
