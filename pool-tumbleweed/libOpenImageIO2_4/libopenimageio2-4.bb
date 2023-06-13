SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "libOpenImageIO2_4-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "cb75ad5938274f476bfb96d83b54f50966596fe3db15a8fdd207ca903f7638e195646f12d40e0b28e2c7b7d2d6b0083d44d87a90b5b27480f10bf911db92cd58"

RPROVIDES:${PN} += "libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO2_4 \
libOpenImageIO2_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libIex-3_1.so.30()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenColorIO.so.2.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libOpenEXRCore-3_1.so.30()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libdcmdata.so.17()(64bit) \
libdcmimage.so.17()(64bit) \
libdcmimgle.so.17()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgif.so.7()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
liboflog.so.17()(64bit) \
libofstd.so.17()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libopenjp2.so.7()(64bit) \
libopenvdb.so.9.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpugixml.so.1()(64bit) \
libraw_r.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit) \
libtbb.so.12()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
