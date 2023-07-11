SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-0.7.1-3.14.aarch64.rpm"
RPM_HASH = "0d029f4fccd66409f92997bbc40d8ce101b6c2a007a39ffcfce15cdf8e8a30b47fdb9751ec1c2eae56d3a726ffa6e6260dcadc87dd86d980db805b08e5b0be3e"

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
