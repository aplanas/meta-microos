SUMMARY = "Development headers for libKPimAddressbookImportExport"
DESCRIPTION = "This package includes development headers needed to develop and build import/export plugins \
for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AddressbookImportExport5-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "11d34ec5bd456f65937a3a0648f803e4afe967790d02078f5dd1587d6ee99588676b7aa460c75c16f59a25811bbb4c64684fb3483a7975381c686005b337490a"

RPROVIDES:${PN} += "cmake-KPim5AddressbookImportExport \
cmake-KPimAddressbookImportExport \
libKPim5AddressbookImportExport5-devel"

RDEPENDS:${PN} += "libKPim5AddressbookImportExport5"

inherit rpm
