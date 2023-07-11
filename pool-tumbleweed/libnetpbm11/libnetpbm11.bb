SUMMARY = "Libraries for the NetPBM (NetPortableBitmap) Graphic Formats"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "11.2.0"

RPM_NAME = "libnetpbm11-11.2.0-1.1.aarch64.rpm"
RPM_HASH = "c1b32b483856a5b8b84c672ef3c3b7ca2084006a07f96523201c8014643e6ddf0fe25b7589c9135686fda38fb7f856a931ada4b0239b9729bb307911a34327ea"

RPROVIDES:${PN} += "libnetpbm \
libnetpbm.so.11 \
libnetpbm11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
