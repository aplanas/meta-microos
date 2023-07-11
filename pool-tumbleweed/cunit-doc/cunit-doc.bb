SUMMARY = "CUnit documentation"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit \
documentation files."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "cunit-doc-2.1.3-5.27.aarch64.rpm"
RPM_HASH = "47ade021d633cd98541f1bb78654dc63f388c33bf954c210e4004242d3851b660455375b4d591ba0e30cb01e8c3892eea76129d1147a975773ac7db1466e5c2e"

RPROVIDES:${PN} += "cunit-doc"

RDEPENDS:${PN} += "libcunit1"

inherit rpm
