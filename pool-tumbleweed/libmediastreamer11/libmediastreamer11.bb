SUMMARY = "Audio/video real-time streaming library, base part"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libmediastreamer11-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "d1796981eebef1623ec31ee7fc07014911ae05fa659e025899c68a029876c2d55d1456b81298103a4f1dbc7701813315eb6865134279ffba46bccdf01e371dba"

RPROVIDES:${PN} += "libmediastreamer.so.11 \
libmediastreamer11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libX11.so.6 \
libXv.so.1 \
libasound.so.2 \
libavcodec.so.60 \
libavutil.so.58 \
libbcg729.so.0 \
libbcmatroska2.so.0 \
libbctoolbox.so.1 \
libbv16.so \
libbzrtp.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libopus.so.0 \
libortp.so.15 \
libpulse.so.0 \
libspeex.so.1 \
libspeexdsp.so.1 \
libsrtp2-linphone.so.1 \
libstdc++.so.6 \
libswscale.so.7 \
libtheora.so.0 \
libturbojpeg.so.0 \
libvpx.so.8"

inherit rpm
