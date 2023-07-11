SUMMARY = "Java logging toolkit"
DESCRIPTION = "LogKit is a logging toolkit designed for secure performance oriented \
logging in applications. To get started using LogKit, it is recomended \
that you read the whitepaper and browse the API docs."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-2.1-24.7.noarch.rpm"
RPM_HASH = "c2822db7d9be411ae0ae0431d2f6cb39e5168e72522b3d7d745eb8c6b283ee0d01dbb0fe196a725e89f45591c84f491f9c3c9f70907abfde3c30697cdd07db33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit \
mvn-avalon-logkit-avalon-logkit \
mvn-avalon-logkit-avalon-logkit-pom- \
mvn-logkit-logkit \
mvn-logkit-logkit-pom- \
mvn-org.apache.avalon.logkit-avalon-logkit \
mvn-org.apache.avalon.logkit-avalon-logkit-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.jms-jms \
mvn-javax.mail-mail \
mvn-javax.servlet-servlet-api \
mvn-log4j-log4j"

inherit rpm
