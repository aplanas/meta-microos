SUMMARY = "Java PDF Library"
DESCRIPTION = "The Apache PDFBox library is an open source Java tool for working with PDF documents. \
This project allows creation of new PDF documents, manipulation of existing documents \
and the ability to extract content from documents. \
Apache PDFBox also includes several command line utilities."
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.28"

RPM_NAME = "apache-pdfbox-2.0.28-1.2.noarch.rpm"
RPM_HASH = "25ad830829c708713bb943732adb51df1e67c2432019a026d121b24eaa68b888ef8708b42d13e758f66fdbd61849bce14a3979aa609964a3fa0d3055cd2c07d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox \
mvn-org.apache.pdfbox-fontbox \
mvn-org.apache.pdfbox-fontbox-pom- \
mvn-org.apache.pdfbox-pdfbox \
mvn-org.apache.pdfbox-pdfbox-debugger \
mvn-org.apache.pdfbox-pdfbox-debugger-pom- \
mvn-org.apache.pdfbox-pdfbox-pom- \
mvn-org.apache.pdfbox-pdfbox-tools \
mvn-org.apache.pdfbox-pdfbox-tools-pom- \
osgi-org.apache.pdfbox \
osgi-org.apache.pdfbox.fontbox"

RDEPENDS:${PN} += "apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
