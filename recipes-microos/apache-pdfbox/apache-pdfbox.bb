SUMMARY = "Java PDF Library"
DESCRIPTION = "The Apache PDFBox library is an open source Java tool for working with PDF documents. \
This project allows creation of new PDF documents, manipulation of existing documents \
and the ability to extract content from documents. \
Apache PDFBox also includes several command line utilities."
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.28"

RPM_NAME = "apache-pdfbox-2.0.28-1.1.noarch.rpm"
RPM_HASH = "09bc1c5411452313a4663f2bb1d23aad2c6eeec1b2c3fa8c36226aa5c320bca9a371a14c96334c933020a09b09209467ccfa162da5f31221cf10023e9f73283d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-pdfbox \
mvn(org.apache.pdfbox:fontbox) \
mvn(org.apache.pdfbox:fontbox:pom:) \
mvn(org.apache.pdfbox:pdfbox) \
mvn(org.apache.pdfbox:pdfbox-debugger) \
mvn(org.apache.pdfbox:pdfbox-debugger:pom:) \
mvn(org.apache.pdfbox:pdfbox-tools) \
mvn(org.apache.pdfbox:pdfbox-tools:pom:) \
mvn(org.apache.pdfbox:pdfbox:pom:) \
osgi(org.apache.pdfbox) \
osgi(org.apache.pdfbox.fontbox)"
RDEPENDS:${PN} += "apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging)"

inherit rpm
