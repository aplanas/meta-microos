SUMMARY = "Development Files for mupdf"
DESCRIPTION = "This package contains development files needed for developing applications \
based on mupdf."
LICENSE = "AGPL-3.0-or-later"

PV = "1.22.2"

RPM_NAME = "mupdf-devel-static-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "7df063ce4559bad83cdd4bf6c8be9218319c0a7780494a9edc2abd17a28ac213f52d501fd391d70dd440bc64e5044f5d1ffba6f30fc19ef5881f9d906102557d"

RPROVIDES:${PN} += "mupdf-devel-static"

RDEPENDS:${PN} += "mupdf"

inherit rpm
