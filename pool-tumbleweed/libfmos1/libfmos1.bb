SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "libfmos1-20220811-2.4.aarch64.rpm"
RPM_HASH = "262676c98fb16df1ecb668f84c13c8f1e5506ad0a771fc48b912a59e089913565da058fa6b8af0a44613aff32de598ece0ed6653a7c7b21b87fc4df34510f6b8"

RPROVIDES:${PN} += "libfmos.so.1 \
libfmos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
