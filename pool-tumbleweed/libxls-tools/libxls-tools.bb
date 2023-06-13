SUMMARY = "Utility for parsing Excel (XLS) files"
DESCRIPTION = "This package contains libxls2csv, a tool which converts an XLS file to \
CSV format, more suitable for parsing."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxls-tools-1.6.2-3.5.aarch64.rpm"
RPM_HASH = "fc5d14c28f5fc8c66192be95a7ce1140fa15982d0346f501d9e6d5898fa60060ee196af9f5c312f64f48719521286a93776ccb731e129f204e011ea4a471d36c"

RPROVIDES:${PN} += "libxls-tools \
libxls-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxlsreader.so.8()(64bit)"

inherit rpm
