SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsapm to \
inspect Apple Partition Map partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20230506"

RPM_NAME = "libvsapm-tools-20230506-1.1.aarch64.rpm"
RPM_HASH = "69549ea8ac5c9f6afbb130bf5ca6948909dd81582e229ae8edbbea1526e66fef4a65b3c7e5896528bb965345b235608fea6c42c344acdc331997d1c1afa018e9"

RPROVIDES:${PN} += "libvsapm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsapm.so.1"

inherit rpm
