SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "67b0bf0a27a0bfe1abafe457d0f5788a13dcbc57b4a850b64e06bdf892a1641ebab9a3e5e6270bcf6f3caf5694f60b3e6af16886c7565735c8cb33d256a9d331"

RPROVIDES:${PN} += "qt6-declarative-docs-qch \
qt6-quickcontrols2-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
