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

RPROVIDES:${PN} += "config(motion) \
motion \
motion(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(video) \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavdevice.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libmicrohttpd.so.12()(64bit) \
libsqlite3.so.0()(64bit) \
libswscale.so.7()(64bit) \
libwebp.so.7()(64bit) \
libwebpmux.so.3()(64bit) \
pwdutils \
systemd"

inherit rpm
