SUMMARY = "Documentation for qt6-serialbus in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "41e0bdad6eb7d6a1368cd967888b7c4246de6e2bc1ff6b69bd0813321ca300d039af824c7139f49edb0c509f0df523a6128a06d3b5150ca9a90afe6902a8b84b"

RPROVIDES:${PN} += "qt6-serialbus-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
