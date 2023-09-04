SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.18.1"

RPM_NAME = "liborcus-0_18-0-0.18.1-3.1.aarch64.rpm"
RPM_HASH = "4ba30137178c7f773175ba1a9c2131285dbe992b9fe878f1cb966854507ac56b370ceca0def2f1ace181c437d30562ae0ba9bc7b31508cb40111af42749aa8e1"

RPROVIDES:${PN} += "liborcus-0-18-0 \
liborcus-0.18.so.0 \
liborcus-mso-0.18.so.0 \
liborcus-parser-0.18.so.0 \
liborcus-spreadsheet-model-0.18.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.18.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
