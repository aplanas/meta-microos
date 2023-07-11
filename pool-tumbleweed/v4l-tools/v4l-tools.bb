SUMMARY = "Video4linux terminal / command line utilities"
DESCRIPTION = "This package includes a bunch of command line utilities: v4lctl to \
control video4linux devices; streamer to record movies; fbtv to watch \
TV on the framebuffer console; ttv to watch tv on any ttv (powered by \
aalib), webcam for capturing and uploading images, a curses radio \
application, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "v4l-tools-3.107-2.11.aarch64.rpm"
RPM_HASH = "3bb7220fc2d8c71a3fc7f5529b30cd7a1cf6a30b983bd3d3f78e016074871cf71da9bbcc4580abb7cf217a32ae1cfd841cf7d8db230498190e5574d598cb0952"

RPROVIDES:${PN} += "v4l-tools \
xawtv-/usr/bin/v4lctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXv.so.1 \
libaa.so.1 \
libasound.so.2 \
libc.so.6 \
libjpeg.so.8 \
liblirc-client.so.0 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libzvbi.so.0 \
tv-common \
v4l-conf"

inherit rpm
