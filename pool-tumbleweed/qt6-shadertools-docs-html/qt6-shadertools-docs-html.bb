SUMMARY = "Documentation for qt6-shadertools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9f74a18e4888705643f21a4bbb84594e2f75e30e0fda44ab17ff9d282e698fea9595a680a8298faa4f73f2a7fcd279b24b40f3ec9083d24324847a893c41ec03"

RPROVIDES:${PN} += "qt6-shadertools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
