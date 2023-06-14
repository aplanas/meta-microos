SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-devel-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "431add463c83de5e0ce707756aa270544431baaf8223873464d9698d69d1881c1def125794b419267f7a7ddf18bc8533c3fbb4e989b92a874aba629964e0879c"

RPROVIDES:${PN} += "liborcus-devel \
pkgconfig-liborcus-0.17 \
pkgconfig-liborcus-spreadsheet-model-0.17"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborcus-0-17-0 \
pkgconfig-zlib"

inherit rpm
