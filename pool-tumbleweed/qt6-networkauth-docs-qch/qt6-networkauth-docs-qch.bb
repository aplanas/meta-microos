SUMMARY = "Documentation for qt6-networkauth in QCH format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-networkauth-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2943a38db8d154881bc84ec9b91c2339a5ca0dde251a4e02a4ff785147666b0abe6839eef93bc428ba1633b1224b9fa5859589a8814404b3271445994fe2c6aa"

RPROVIDES:${PN} += "qt6-networkauth-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
