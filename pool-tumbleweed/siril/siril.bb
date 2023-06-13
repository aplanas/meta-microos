SUMMARY = "An astronomical image processing software for Linux. (IRIS clone)"
DESCRIPTION = "Siril is meant to be Iris for Linux (sirI-L). It is an astronomical image \
processing tool, able to convert, pre-process images, help aligning them \
automatically or manually, stack them and enhance final images."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "siril-1.0.6-1.13.aarch64.rpm"
RPM_HASH = "e09caa596b336aa7a08c78d617890d184a393776b0047d7bae7d6bef3e9e4cf551f8c86f7ed4cb4a8a751e1aacec2178509bbb12cc047746ec5feb5ac6e530c8"

RPROVIDES:${PN} += "application() \
application(org.free_astro.siril.desktop) \
metainfo() \
metainfo(org.free_astro.siril.appdata.xml) \
mimehandler(application/bmp) \
mimehandler(application/fits) \
mimehandler(application/jpeg) \
mimehandler(application/pic) \
mimehandler(application/png) \
mimehandler(application/tiff) \
mimehandler(image/bmp) \
mimehandler(image/fits) \
mimehandler(image/jpeg) \
mimehandler(image/pic) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-kodak-dcr) \
mimehandler(image/x-kodak-k25) \
mimehandler(image/x-kodak-kdc) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-panasonic-raw) \
mimehandler(image/x-panasonic-raw2) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-sigma-x3f) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-sony-sr2) \
mimehandler(image/x-sony-srf) \
mimehandler(image/x-xisf) \
mimehandler(text/x-seq) \
mimehandler(video/ser) \
siril \
siril(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcfitsio.so.10()(64bit) \
libconfig.so.11()(64bit) \
libexiv2.so.27()(64bit) \
libffms2.so.5()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(GOMP_5.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopencv_calib3d.so.407()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libraw.so.23()(64bit) \
librtprocess.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libswresample.so.4.ff5()(64bit) \
libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) \
libswscale.so.6()(64bit) \
libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwcs.so.7()(64bit)"

inherit rpm
