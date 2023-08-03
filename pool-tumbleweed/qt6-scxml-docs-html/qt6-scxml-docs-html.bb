SUMMARY = "Documentation for qt6-scxml in HTML format"
DESCRIPTION = "This package contains documentation for qt6-scxml in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "af44d2da49d47b669c23b650dee5d37a1db34714cf1337a9e57eb22bc9fda877b5b66cfcadb8b4f9eba3b95815602e2ceb2447d8360630b5246d467dcbaae7d1"

RPROVIDES:${PN} += "qt6-scxml-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
