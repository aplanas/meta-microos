SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This library can handle MNG and JNG formats which contain animated \
pictures. These formats should replace the GIF format. \
 \
This package contains the static library and the header files."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng-devel-2.0.3-3.3.aarch64.rpm"
RPM_HASH = "14b6e01bc4e8c20a2958188a10996581cd3ac361d3900f02d36fc0c2ff83296ce1d089d0b6fd125b8728e893a7c8c934da8d6bbbff206048aaa2cf9a963b9647"

RPROVIDES:${PN} += "libmng-devel \
pkgconfig-libmng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
liblcms2-devel \
libmng2 \
zlib-devel"

inherit rpm
