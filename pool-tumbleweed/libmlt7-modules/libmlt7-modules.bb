SUMMARY = "Modules for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt7-modules-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "bc76d545f8a8a6cfb9f8bd4873a430fd6853bdac07304bc23032842978e8591ec7df88b3b0fa69321ecad81e34bbbd10333d04594af40574fab9a84e7f361280"

RPROVIDES:${PN} += "libmlt7-modules \
libmlt7-modules(aarch-64) \
libmltavformat.so()(64bit) \
libmltcore.so()(64bit) \
libmltdecklink.so()(64bit) \
libmltfrei0r.so()(64bit) \
libmltgdk.so()(64bit) \
libmltglaxnimate.so()(64bit) \
libmltjackrack.so()(64bit) \
libmltkdenlive.so()(64bit) \
libmltmovit.so()(64bit) \
libmltnormalize.so()(64bit) \
libmltoldfilm.so()(64bit) \
libmltopencv.so()(64bit) \
libmltplus.so()(64bit) \
libmltplusgpl.so()(64bit) \
libmltqt.so()(64bit) \
libmltresample.so()(64bit) \
libmltrtaudio.so()(64bit) \
libmltrubberband.so()(64bit) \
libmltsdl2.so()(64bit) \
libmltsox.so()(64bit) \
libmltvidstab.so()(64bit) \
libmltvorbis.so()(64bit) \
libmltxine.so()(64bit) \
libmltxml.so()(64bit) \
mlt(7)(avformat)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libarchive.so.13()(64bit) \
libavcodec.so.59()(64bit) \
libavdevice.so.59()(64bit) \
libavfilter.so.8()(64bit) \
libavformat.so.59()(64bit) \
libavutil.so.57()(64bit) \
libc.so.6()(64bit) \
libebur128.so.1()(64bit) \
libepoxy.so.0()(64bit) \
libexif.so.12()(64bit) \
libfftw3.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libmlt++-7.so.7()(64bit) \
libmlt-7.so.7()(64bit) \
libmovit.so.8()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_tracking.so.407()(64bit) \
libopencv_video.so.407()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
librtaudio.so.6()(64bit) \
librubberband.so.2()(64bit) \
libsamplerate.so.0()(64bit) \
libsox.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4.ff5()(64bit) \
libswscale.so.6()(64bit) \
libvidstab.so.1.1()(64bit) \
libvorbisfile.so.3()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
