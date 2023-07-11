SUMMARY = "XML Graphics Commons"
DESCRIPTION = "Apache XML Graphics Commons is a library that consists of \
several reusable components used by Apache Batik and \
Apache FOP. Many of these components can easily be used \
separately outside the domains of SVG and XSL-FO. You will \
find components such as a PDF library, an RTF library, \
Graphics2D implementations that let you generate PDF & \
PostScript files, and much more."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-commons-2.8-1.3.noarch.rpm"
RPM_HASH = "546161d9e02ac6d6bbad0ce36fc7c7ae59cab52c5b86978cbace75f07c68ec577a53b6a59cbe29cfcfc434c6e02dbdd5653d7a84d7e25d509d2a563b424aecb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.xmlgraphics-xmlgraphics-commons \
mvn-org.apache.xmlgraphics-xmlgraphics-commons-pom- \
osgi-org.apache.xmlgraphics \
xmlgraphics-commons"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging"

inherit rpm
