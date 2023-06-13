SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-0_17-0-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "4d21317d32835381e4a01276dbb61b0750aa59e7358d8f1fdec1c5069ea83fc1409435b0196b53c2c4fc8742b9d6a98b9ca093392faf148bf6c210e0efee358a"

RPROVIDES:${PN} += "liborcus-0.17.so.0()(64bit) \
liborcus-0_17-0 \
liborcus-0_17-0(aarch-64) \
liborcus-mso-0.17.so.0()(64bit) \
liborcus-parser-0.17.so.0()(64bit) \
liborcus-spreadsheet-model-0.17.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libixion-0.17.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
