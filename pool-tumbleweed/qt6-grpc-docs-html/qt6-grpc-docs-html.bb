SUMMARY = "Documentation for qt6-grpc in HTML format"
DESCRIPTION = "This package contains documentation for qt6-grpc in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-grpc-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8de249483d1baec85a9513476a2a05ffd91909739d8958c0a163a57c6c39e68feb365e6ab679c1d6910f17978c87967fd8848e954f31eef5924a5cc17a5e92bf"

RPROVIDES:${PN} += "qt6-grpc-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
