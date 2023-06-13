SUMMARY = "Viewer for dBase III and dBase IV Files"
DESCRIPTION = "dbview is a little tool that displays dBase III and IV files. You can \
also use it to convert your old .dbf files for further use with Unix."
LICENSE = "GPL-2.0+"

PV = "1.0.4"

RPM_NAME = "dbview-1.0.4-117.25.aarch64.rpm"
RPM_HASH = "6b2639945092265aaf4ec8dc4612989adc9400dee02c3c8a93118a8957fdf76f6213de4b54a69538190dfdec9d75b8dfe3e0b1f2188a1205e16b27745654bca5"

RPROVIDES:${PN} += "dbview \
dbview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
