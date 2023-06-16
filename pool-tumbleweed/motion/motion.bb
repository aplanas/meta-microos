SUMMARY = "A motion detection system"
DESCRIPTION = "Motion is a software motion detector. It grabs images from video4linux devices \
and/or from webcams (such as the axis network cameras). Motion is the perfect \
tool for keeping an eye on your property keeping only those images that are \
interesting. Motion is strictly command line driven and can run as a daemon \
with a rather small footprint. This version is built with ffmpeg support but \
without MySQL and PostgreSQL support."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "motion-4.5.1-1.4.aarch64.rpm"
RPM_HASH = "ce9eeda6ff9b2ef9e2a02abf37b5e46d793381ea631b51c07d7c08830e69d6035b04d2f852ad597b3d016c5bdc5cbf10921695674c40c905c1013a6a765ac5eb"

RPROVIDES:${PN} += "config-motion \
motion"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-video \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavdevice.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libjpeg.so.8 \
libmicrohttpd.so.12 \
libsqlite3.so.0 \
libswscale.so.7 \
libwebp.so.7 \
libwebpmux.so.3 \
pwdutils \
systemd"

inherit rpm
