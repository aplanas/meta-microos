SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-0_17-0-0.17.2-3.5.aarch64.rpm"
RPM_HASH = "5a9d4efc872ec11c8aed45ac2f9b79901e88dacbb14463b8d1fc7f85b34ff40df8d8029920bd9440283b660d378ae2e410b32a3b97f625088e62b0daf3c2afc9"

RPROVIDES:${PN} += "liborcus-0-17-0 \
liborcus-0.17.so.0 \
liborcus-mso-0.17.so.0 \
liborcus-parser-0.17.so.0 \
liborcus-spreadsheet-model-0.17.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.17.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
