SUMMARY = "Documentation for qt6-connectivity in QCH format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7c9a693afb9e0f059da46e634d6e1de050b28065990320c5dc8fda67092c60f17674fce9cbbf08989d3ea4dcfa401b9ae8c2cb014379bb49089d7cfd2846d893"

RPROVIDES:${PN} += "qt6-connectivity-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
