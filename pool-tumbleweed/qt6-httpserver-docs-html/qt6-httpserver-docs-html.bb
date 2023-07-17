SUMMARY = "Documentation for qt6-httpserver in HTML format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "80edbf17c85efb75a08fce1349e232148aff1aba59d5fcea355cd83003b5cbd707ea0bbb05bf1576fa4517e5a814b14754498f60f15509a9d27e18cb1900fb26"

RPROVIDES:${PN} += "qt6-httpserver-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
