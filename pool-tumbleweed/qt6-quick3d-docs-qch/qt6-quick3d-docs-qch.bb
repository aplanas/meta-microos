SUMMARY = "Documentation for qt6-quick3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "630847266aaf2c0f809ba17bae56e50488d975def7442edaa3da122b49dd8e706ab586ccd4f51740e3a350ece803f55097a0afbce1db355b6b445e21d850fe8b"

RPROVIDES:${PN} += "qt6-quick3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
