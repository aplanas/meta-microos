SUMMARY = "Documentation for Bless"
DESCRIPTION = "Bless is a hex editor. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "bless-doc-0.6.3-2.5.aarch64.rpm"
RPM_HASH = "5fd90a0ffc2db222049d9d3ac77a9715b0c09c4fbf48802e8e1313ed048bf02f88a3073c03b8fe63e233e03e9380048780ad5cef9fe0253f507909b81f3c31ff"

RPROVIDES:${PN} += "bless-doc bless-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
