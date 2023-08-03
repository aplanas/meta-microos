SUMMARY = "Documentation for qt6-location in QCH format"
DESCRIPTION = "This package contains documentation for qt6-location in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "bf8ee56d0e893e6738170e008fe2cc1d078bfcf0427f68a1690ad813ae12ad07a0aaefaf0bf5f7f30a86c8a25669a89e5e12da789dacfdbc9b5e71a20310961b"

RPROVIDES:${PN} += "qt6-location-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
