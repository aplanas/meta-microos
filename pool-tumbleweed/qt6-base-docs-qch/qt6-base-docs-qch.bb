SUMMARY = "Documentation for qt6-base in QCH format"
DESCRIPTION = "This package contains documentation for qt6-base in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-base-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7bf9b1febdd9456c7ff7e9987b75dcbb60a21e8b884b5abc4c69a822de4ae4032f9afa654dae2ce011f5020664505b00d39188b967c8e90e205b61a784651f3a"

RPROVIDES:${PN} += "qt6-base-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
