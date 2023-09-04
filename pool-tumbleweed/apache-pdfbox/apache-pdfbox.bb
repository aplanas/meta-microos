SUMMARY = "Java PDF Library"
DESCRIPTION = "The Apache PDFBox library is an open source Java tool for working with PDF documents. \
This project allows creation of new PDF documents, manipulation of existing documents \
and the ability to extract content from documents. \
Apache PDFBox also includes several command line utilities."
LICENSE = "Apache-2.0 & OFL-1.1"

PV = "2.0.29"

RPM_NAME = "apache-pdfbox-2.0.29-1.1.noarch.rpm"
RPM_HASH = "89b83002649f9339eda10b08d37515de6b896b696280b37b76dbcdacc5ae0b0519857daf0e60ac046e8e029b8e59182045c709e592c3f5da221aab78c7b1ec83"
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
mvn-org.apache.pdfbox-xmpbox \
mvn-org.apache.pdfbox-xmpbox-pom- \
osgi-org.apache.pdfbox \
osgi-org.apache.pdfbox.fontbox \
osgi-org.apache.pdfbox.xmpbox"

RDEPENDS:${PN} += "apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
