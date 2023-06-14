SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-0.7.1-3.13.aarch64.rpm"
RPM_HASH = "c690fee85d72cc0062a538016890f08bdf306a8c856c3fa28e912726c4f61d9eb13d856139134b9e78819cc95b5640d83d7cef25d736004340b747669e7217ca"

RPROVIDES:${PN} += "camsource \
config-camsource \
libbw.so.0 \
libfilewrite.so.0 \
libflip.so.0 \
libftpup.so.0 \
libgamma.so.0 \
libhttp.so.0 \
libinput-v4l.so.0 \
libinput-xwd.so.0 \
libinvert.so.0 \
libjpeg-comp.so.0 \
libmotiondetect.so.0 \
libregrab.so.0 \
libresize.so.0 \
librgbbgr.so.0 \
librotate.so.0 \
libsaturate.so.0 \
libsharpen.so.0 \
libsocket.so.0 \
libtext.so.0 \
libvloopback.so.0 \
libwc-serv.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libv4l1.so.0 \
libxml2.so.2"

inherit rpm
