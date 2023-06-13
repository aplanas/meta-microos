SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "libfmos1-20220811-2.4.aarch64.rpm"
RPM_HASH = "262676c98fb16df1ecb668f84c13c8f1e5506ad0a771fc48b912a59e089913565da058fa6b8af0a44613aff32de598ece0ed6653a7c7b21b87fc4df34510f6b8"

RPROVIDES:${PN} += "libfmos.so.1()(64bit) \
libfmos.so.1(V_20220811)(64bit) \
libfmos1 \
libfmos1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit)"

inherit rpm
