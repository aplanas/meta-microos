SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20.4"

RPM_NAME = "go1.20-doc-1.20.4-1.1.aarch64.rpm"
RPM_HASH = "0fdd4d3f30afcdb8d05f81ffe619fa9ff8afff366c3f662fc6d284dccd47377bf33549de9d1522718c02abf81ac6beaab0970d6a2fb99e08780de24b741926ba"

RPROVIDES:${PN} += "go-doc \
go1.20-doc \
go1.20-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
