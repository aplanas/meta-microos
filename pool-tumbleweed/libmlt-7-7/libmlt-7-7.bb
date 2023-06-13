SUMMARY = "C library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libmlt-7-7-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "554ab8c3f52750a68d51628203e76a72026a1e209429b8330d31e1f76a2ef1371580235db8771a66fc3eaed36a5880ab6156fa9c8173a0e8d0fcd8632882d0f5"

RPROVIDES:${PN} += "libmlt-7-7 \
libmlt-7-7(aarch-64) \
libmlt-7.so.7()(64bit) \
libmlt-7.so.7(MLT_0.8.8)(64bit) \
libmlt-7.so.7(MLT_0.9.0)(64bit) \
libmlt-7.so.7(MLT_0.9.10)(64bit) \
libmlt-7.so.7(MLT_0.9.2)(64bit) \
libmlt-7.so.7(MLT_0.9.4)(64bit) \
libmlt-7.so.7(MLT_0.9.8)(64bit) \
libmlt-7.so.7(MLT_6.10.0)(64bit) \
libmlt-7.so.7(MLT_6.12.0)(64bit) \
libmlt-7.so.7(MLT_6.14.0)(64bit) \
libmlt-7.so.7(MLT_6.18.0)(64bit) \
libmlt-7.so.7(MLT_6.20.0)(64bit) \
libmlt-7.so.7(MLT_6.22.0)(64bit) \
libmlt-7.so.7(MLT_6.4.0)(64bit) \
libmlt-7.so.7(MLT_6.6.0)(64bit) \
libmlt-7.so.7(MLT_6.8.0)(64bit) \
libmlt-7.so.7(MLT_7.0.0)(64bit) \
libmlt-7.so.7(MLT_7.1.0)(64bit) \
libmlt-7.so.7(MLT_7.10.0)(64bit) \
libmlt-7.so.7(MLT_7.12.0)(64bit) \
libmlt-7.so.7(MLT_7.14.0)(64bit) \
libmlt-7.so.7(MLT_7.4.0)(64bit) \
libmlt-7.so.7(MLT_7.6.0)(64bit) \
libmlt-7.so.7(MLT_7.8.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
