SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-devel-0.17.2-3.5.aarch64.rpm"
RPM_HASH = "539bfebc0a10b8cb3b83adc2372e1afb2dee72c44fb1d95cd54576da2e5f45be57f5b4d95a97c36ed2b1a856aa3426d66a480fae52efd06570695e8558c45a26"

RPROVIDES:${PN} += "liborcus-devel \
pkgconfig-liborcus-0.17 \
pkgconfig-liborcus-spreadsheet-model-0.17"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborcus-0-17-0 \
pkgconfig-zlib"

inherit rpm
