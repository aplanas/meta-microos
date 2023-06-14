SUMMARY = "Documentation for qt6-grpc in HTML format"
DESCRIPTION = "This package contains documentation for qt6-grpc in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9c8301ea15a4e58c7318907c6af272f14c635199b2ab74746c73a3555901f4bf40b74696fab76e6e7beeca5d971d7b26a779f18eab33529e3538033884896b0e"

RPROVIDES:${PN} += "qt6-grpc-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
