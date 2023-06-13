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
libmlt-7.so.7()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
