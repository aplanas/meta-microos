SUMMARY = "Video player with plugins"
DESCRIPTION = "xine is a free multimedia player. It plays back CDs, DVDs, and VCDs. It \
also decodes multimedia files like AVI, MOV, WMV, and MP3 from local \
disk drives, and displays multimedia streamed over the Internet. It \
interprets many of the most common multimedia formats available - and \
some of the most uncommon formats, too. \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.99.14"

RPM_NAME = "xine-ui-0.99.14-1.3.aarch64.rpm"
RPM_HASH = "b51d778347a42d5eb5c0410cf14e0f995dfe683bd034629c90b5dfe8e4c73ebb4136806e850644f6e3c5a51674e73404b92e973798484ccf92f620103b766c22"

RPROVIDES:${PN} += "application() \
application(xine.desktop) \
mimehandler(application/adrift) \
mimehandler(application/annodex) \
mimehandler(application/flac) \
mimehandler(application/ogg) \
mimehandler(application/playerpro) \
mimehandler(application/smil) \
mimehandler(application/x-annodex) \
mimehandler(application/x-flac) \
mimehandler(application/x-ogg) \
mimehandler(application/x-ogm) \
mimehandler(application/x-ogm-audio) \
mimehandler(application/x-ogm-video) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/xspf+xml) \
mimehandler(audio/ac3) \
mimehandler(audio/aiff) \
mimehandler(audio/annodex) \
mimehandler(audio/basic) \
mimehandler(audio/flac) \
mimehandler(audio/it) \
mimehandler(audio/med) \
mimehandler(audio/mod) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpeg2) \
mimehandler(audio/mpeg3) \
mimehandler(audio/mpegurl) \
mimehandler(audio/musepack) \
mimehandler(audio/ogg) \
mimehandler(audio/opus) \
mimehandler(audio/s3m) \
mimehandler(audio/wav) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-amf) \
mimehandler(audio/x-annodex) \
mimehandler(audio/x-basic) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-it) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpeg2) \
mimehandler(audio/x-mpeg3) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wvx) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-ogg) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-xm) \
mimehandler(audio/xm) \
mimehandler(image/png) \
mimehandler(image/x-png) \
mimehandler(video/annodex) \
mimehandler(video/mng) \
mimehandler(video/ogg) \
mimehandler(video/x-annodex) \
mimehandler(video/x-flic) \
mimehandler(video/x-mng) \
mimehandler(video/x-ogg) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
xine-ui \
xine-ui(aarch-64) \
xine:/usr/bin/xine"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXss.so.1()(64bit) \
libXtst.so.6()(64bit) \
libXv.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblirc_client.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libreadline.so.8()(64bit) \
libxine.so.2()(64bit)"

inherit rpm
