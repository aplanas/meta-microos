SUMMARY = "Documentation for qt6-connectivity in QCH format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f1b1cd97cac5b9e6ca2c5a19c6be0b5cab2f44b5dbf313c360fdf4c1927b5f18f238dc19c0374b50a66b8eab45fd348f623dcb091eebe7b3127cca32ec7cfea1"

RPROVIDES:${PN} += "qt6-connectivity-docs-qch \
qt6-connectivity-docs-qch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
