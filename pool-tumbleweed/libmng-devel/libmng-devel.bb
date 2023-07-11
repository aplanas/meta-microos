SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This library can handle MNG and JNG formats which contain animated \
pictures. These formats should replace the GIF format. \
 \
This package contains the static library and the header files."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng-devel-2.0.3-3.4.aarch64.rpm"
RPM_HASH = "fffc360324cd307f8eb4a90b171c11a57cf725669e2653da8a0f16b30ffe79b1a3ff61614a721949a811c7ad43318209d57b068680f8c9eda630198ed515a12a"

RPROVIDES:${PN} += "libmng-devel \
pkgconfig-libmng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
liblcms2-devel \
libmng2 \
zlib-devel"

inherit rpm
