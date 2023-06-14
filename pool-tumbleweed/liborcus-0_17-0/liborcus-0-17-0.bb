SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-0_17-0-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "4d21317d32835381e4a01276dbb61b0750aa59e7358d8f1fdec1c5069ea83fc1409435b0196b53c2c4fc8742b9d6a98b9ca093392faf148bf6c210e0efee358a"

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
