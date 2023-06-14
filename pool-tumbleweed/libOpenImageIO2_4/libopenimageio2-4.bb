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

RPROVIDES:${PN} += "libOpenImageIO.so.2.4 \
libOpenImageIO2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libImath-3-1.so.29 \
libOpenColorIO.so.2.1 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libOpenImageIO-Util.so.2.4 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libdcmdata.so.17 \
libdcmimage.so.17 \
libdcmimgle.so.17 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libheif.so.1 \
libjpeg.so.8 \
libm.so.6 \
liboflog.so.17 \
libofstd.so.17 \
libopencv-core.so.407 \
libopencv-imgproc.so.407 \
libopencv-videoio.so.407 \
libopenjp2.so.7 \
libopenvdb.so.9.0 \
libpng16.so.16 \
libpugixml.so.1 \
libraw-r.so.23 \
libstdc++.so.6 \
libswscale.so.7 \
libtbb.so.12 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libz.so.1"

inherit rpm
