SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-0.7.1-3.13.aarch64.rpm"
RPM_HASH = "c690fee85d72cc0062a538016890f08bdf306a8c856c3fa28e912726c4f61d9eb13d856139134b9e78819cc95b5640d83d7cef25d736004340b747669e7217ca"

RPROVIDES:${PN} += "camsource \
camsource(aarch-64) \
config(camsource) \
libbw.so.0()(64bit) \
libfilewrite.so.0()(64bit) \
libflip.so.0()(64bit) \
libftpup.so.0()(64bit) \
libgamma.so.0()(64bit) \
libhttp.so.0()(64bit) \
libinput_v4l.so.0()(64bit) \
libinput_xwd.so.0()(64bit) \
libinvert.so.0()(64bit) \
libjpeg_comp.so.0()(64bit) \
libmotiondetect.so.0()(64bit) \
libregrab.so.0()(64bit) \
libresize.so.0()(64bit) \
librgbbgr.so.0()(64bit) \
librotate.so.0()(64bit) \
libsaturate.so.0()(64bit) \
libsharpen.so.0()(64bit) \
libsocket.so.0()(64bit) \
libtext.so.0()(64bit) \
libvloopback.so.0()(64bit) \
libwc_serv.so.0()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libv4l1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
