SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8212a07379e7ab1820801e01d5d6d3362e84f94caf41bcc27ed16cf1032f8023a04454af28b7164108758b2fbff68d042d287da57edda40eaaee9b24eafcdafc"

RPROVIDES:${PN} += "qt6-declarative-docs-qch \
qt6-quickcontrols2-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
