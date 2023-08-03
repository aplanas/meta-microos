SUMMARY = "Documentation for qt6-httpserver in HTML format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-httpserver-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "dcbb7a1a458bc699acbc301487b6222fffaa410ddc3e8c890115574a57fa6dba53e4254c53972f839f228402e70095aaf8963e378e6ddd65bd6da108cdbccaed"

RPROVIDES:${PN} += "qt6-httpserver-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
