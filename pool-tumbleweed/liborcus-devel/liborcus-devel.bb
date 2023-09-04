SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.18.1"

RPM_NAME = "liborcus-devel-0.18.1-3.1.aarch64.rpm"
RPM_HASH = "f6786879f7343f6af58f0ee00273b99d5af1407e8e0646f1ffa4a0ed9a06026a9996acee99a3db14655bbe96f89a26019b491487ec73a7908b2e213a457a5ad0"

RPROVIDES:${PN} += "liborcus-devel \
pkgconfig-liborcus-0.18 \
pkgconfig-liborcus-spreadsheet-model-0.18"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborcus-0-18-0 \
pkgconfig-zlib"

inherit rpm
