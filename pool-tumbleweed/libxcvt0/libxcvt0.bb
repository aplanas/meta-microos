SUMMARY = "CVT standard timing modeline generator"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "libxcvt0-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "dfa991882af7c87971e8de5b5c457dff07e209fcf31fbd42bfd098e3ddb1ca0bf1c197319c41066ebd7083a0db666b7e8a70eac8694ab8d3487c1082538aacca"

RPROVIDES:${PN} += "libxcvt.so.0()(64bit) \
libxcvt0 \
libxcvt0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
