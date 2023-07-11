SUMMARY = "Video Player with Plug-Ins"
DESCRIPTION = "xine is a video player with a graphical front-end that supports a large \
number of file formats (VCD and MPEG2, for example) using plug-ins. \
Several plug-ins are included. Others can be installed after xine \
installation. xine supports stereo sound using OSS and AC5.1 using \
Alsa. \
 \
 \
This version of xine may lack certain features because of legal \
requirements (potential patent violation). See also \
http://en.opensuse.org/XINE#Legal_Matters \
 \
 \
More information about xine plug-ins can be found at \
http://www.xine-project.org/home \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@sourceforge.net>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.13"

RPM_NAME = "libxine2-1.2.13-2.3.aarch64.rpm"
RPM_HASH = "105c30ca2a28d98dac1f161023a3d8e63692af921f110eb71afccc2bd8b3fba6dc36d908fa1a6f07ac5a1432f30c89e4545e61e66a7bdd90ce3becf5788ee5be"

RPROVIDES:${PN} += "libxine.so.2 \
libxine2 \
libxine2-dvb \
libxine2-syncfb \
libxine2-xvmc \
xine-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libFLAC.so.12 \
libGL.so.1 \
libGLU.so.1 \
libMagickWand-7.Q16HDRI.so.10 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libXvMCW.so.1 \
liba52.so.0 \
libasound.so.2 \
libc.so.6 \
libdvdnav.so.4 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libmng.so.2 \
libmodplug.so.1 \
libmpcdec.so.5 \
libogg.so.0 \
libpng16.so.16 \
libsmbclient.so.0 \
libspeex.so.1 \
libtheora.so.0 \
libv4l2.so.0 \
libvorbis.so.0 \
libvpx.so.8 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xv.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
