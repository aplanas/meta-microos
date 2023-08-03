SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-base-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "794a8692fac61615c4d7b993113e3877dbe9b5fe295476135b06f9ff04ee8ae0e7113fc746a9cb3831d3829b09279b5e49f6ab40238d7c6b428bca016ac6c2ce"

RPROVIDES:${PN} += "qt6-base-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
