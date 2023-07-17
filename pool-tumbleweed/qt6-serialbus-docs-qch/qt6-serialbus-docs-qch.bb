SUMMARY = "Documentation for qt6-serialbus in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7948a5fe17ed6af89bd26846c4d66f81294452cb0e684e0c6c91e5ac8badb616ff5099b12ffcd4130f36fa58ccce109ca0871ca0c0cf76c6a08ed5e7e20924c0"

RPROVIDES:${PN} += "qt6-serialbus-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
