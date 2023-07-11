SUMMARY = "Library for Support of MNG and JNG Formats"
DESCRIPTION = "This library can handle MNG and JNG formats that contain animated \
pictures. These formats should replace the GIF format."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng2-2.0.3-3.4.aarch64.rpm"
RPM_HASH = "8fed175319040dce2b8d468e5229abef94564c21534bfc9b02d7632d1105a52c171a55971984710303b911f427253b8f260c99f8dda836dfd8af19aa2a8f7f84"

RPROVIDES:${PN} += "libmng.so.2 \
libmng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libz.so.1"

inherit rpm
