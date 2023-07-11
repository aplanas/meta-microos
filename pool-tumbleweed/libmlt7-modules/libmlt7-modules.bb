SUMMARY = "Modules for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "libmlt7-modules-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "7b107cf71b97bd316bbeb6808d58c09e2dc9be0651e9911fb9ee06a8e9535eb4ae520ed4d0d909ae7b92bdd7a458929a60e46a6bdaba9c8ecfe37f512f8bebbc"

RPROVIDES:${PN} += "libmlt7-modules \
libmltavformat.so \
libmltcore.so \
libmltdecklink.so \
libmltfrei0r.so \
libmltgdk.so \
libmltglaxnimate.so \
libmltjackrack.so \
libmltkdenlive.so \
libmltmovit.so \
libmltnormalize.so \
libmltoldfilm.so \
libmltopencv.so \
libmltplus.so \
libmltplusgpl.so \
libmltqt.so \
libmltresample.so \
libmltrtaudio.so \
libmltrubberband.so \
libmltsdl2.so \
libmltsox.so \
libmltvidstab.so \
libmltvorbis.so \
libmltxine.so \
libmltxml.so \
mlt-7)(avformat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libebur128.so.1 \
libepoxy.so.0 \
libexif.so.12 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libmovit.so.8 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-tracking.so.407 \
libopencv-video.so.407 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
librtaudio.so.6 \
librubberband.so.2 \
libsamplerate.so.0 \
libsox.so.3 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libvidstab.so.1.1 \
libvorbisfile.so.3 \
libxml2.so.2 \
libz.so.1"

inherit rpm
