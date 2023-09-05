SUMMARY = "Open Source XML framework for Java"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "dom4j-bootstrap-2.1.4-1.1.noarch.rpm"
RPM_HASH = "c24ab5b4a44fb07eb53a2015ebf7ecb960a3a0c746ecb22beca532952c1f2a5736418970bdbd1d0b398e30ccae6bfddaff518ef75f4a34ea381f6a3b70a8a76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-bootstrap"

RDEPENDS:${PN} += ""

inherit rpm
