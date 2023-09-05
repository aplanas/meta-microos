SUMMARY = "Open Source XML framework for Java"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "dom4j-2.1.4-1.1.noarch.rpm"
RPM_HASH = "db56a5f15a37b874580b526d350cf25bc36d83a27b862202b79ba0ed0472d1707ff1c4f423140bcdfbdf03b0cd0a04ab48c3711b36c43953c89c9d021c9064aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j \
mvn-dom4j-dom4j \
mvn-dom4j-dom4j-pom- \
mvn-org.dom4j-dom4j \
mvn-org.dom4j-dom4j-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
