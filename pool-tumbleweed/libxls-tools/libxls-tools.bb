SUMMARY = "Utility for parsing Excel (XLS) files"
DESCRIPTION = "This package contains libxls2csv, a tool which converts an XLS file to \
CSV format, more suitable for parsing."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxls-tools-1.6.2-3.6.aarch64.rpm"
RPM_HASH = "2e9947c023412aa23b23c440fe53f1ec738073e73031b49bc64edb61693e1c9c3636d6bea911408f53976cc9d6fa0b359329490aca25d1f0db8d0dcf77df0435"

RPROVIDES:${PN} += "libxls-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxlsreader.so.8"

inherit rpm
