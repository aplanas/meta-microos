SUMMARY = "An astronomical image processing software for Linux. (IRIS clone)"
DESCRIPTION = "Siril is meant to be Iris for Linux (sirI-L). It is an astronomical image \
processing tool, able to convert, pre-process images, help aligning them \
automatically or manually, stack them and enhance final images."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "siril-1.0.6-2.2.aarch64.rpm"
RPM_HASH = "678bd368d1e654bb5fc314445a9c41e99f3df59970229823da4899fbca014702f9998ba6485aa7d0d92757bb3d11ee5d7f65aa7ee74cdd098279e5da017d3ca0"

RPROVIDES:${PN} += "siril"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libconfig.so.11 \
libexiv2.so.28 \
libffms2.so.5 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libopencv-calib3d.so.407 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libraw.so.23 \
librtprocess.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libtiff.so.6 \
libwcs.so.7"

inherit rpm
