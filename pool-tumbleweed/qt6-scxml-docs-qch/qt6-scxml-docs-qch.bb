SUMMARY = "Documentation for qt6-scxml in QCH format"
DESCRIPTION = "This package contains documentation for qt6-scxml in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4cd0959b8b3a5ebbbaafd4c29db8652c983f95f4a638da9ee40b8b0995ffdc59a178ea1846cde85b7dbc5e39e88f62214fe5f51edc1f656ce8d5c9b9380d8ce4"

RPROVIDES:${PN} += "qt6-scxml-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
