SUMMARY = "Documentation for qt6-shadertools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "47166000eec08cc3daebcc8aeb799d6f993f28e6bcd9cfebf2a9c79777b360c7d705c1b25c0988ae0f32fb1e35df6f5f8cb9a971b7bd66748d938e8a94a33765"

RPROVIDES:${PN} += "qt6-shadertools-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
