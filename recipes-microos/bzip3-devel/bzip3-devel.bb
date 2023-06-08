SUMMARY = "Development files for libbzip3"
DESCRIPTION = "Development headers and library files for BZip3."
LICENSE = "LGPL-3.0-or-later & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "bzip3-devel-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "00ec8d44d785cd8fdaf8b306fdee395fd88e78b0ff1fff416d5134a85bd6277a0bab3a4642a9653fee4bcb71ea42e537b52f29cee7e2b097426078746003d7db"

RPROVIDES:${PN} += "bzip3-devel bzip3-devel(aarch-64) pkgconfig(bzip3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbzip3-0"

inherit rpm
