SUMMARY = "Development headers for libKPimAddressbookImportExport"
DESCRIPTION = "This package includes development headers needed to develop and build import/export plugins \
for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AddressbookImportExport5-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "817504134d910da807b489d2c8bddec6a4d5b9742c1545626d9d33b3d2c76624fc029f66c294d5d7ddd1d07f81afdfcef3d8db174768486ea154080bb90bd1f9"

RPROVIDES:${PN} += "cmake-KPim5AddressbookImportExport \
cmake-KPimAddressbookImportExport \
libKPim5AddressbookImportExport5-devel"

RDEPENDS:${PN} += "libKPim5AddressbookImportExport5"

inherit rpm
