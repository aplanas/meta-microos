SUMMARY = "Library for Support of MNG and JNG Formats"
DESCRIPTION = "This library can handle MNG and JNG formats that contain animated \
pictures. These formats should replace the GIF format."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libmng2-2.0.3-3.3.aarch64.rpm"
RPM_HASH = "886c47216604a64051e87098725fc54eaa97cf5aca7cdc964beb6614f7657d5b8f7e0425842b42385a26e0c07a1971ab1ee78b5d241bfae7d6dbe2c09fcba2db"

RPROVIDES:${PN} += "libmng.so.2()(64bit) \
libmng2 \
libmng2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
