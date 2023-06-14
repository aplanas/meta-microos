SUMMARY = "Java logging toolkit"
DESCRIPTION = "LogKit is a logging toolkit designed for secure performance oriented \
logging in applications. To get started using LogKit, it is recomended \
that you read the whitepaper and browse the API docs."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-2.1-24.6.noarch.rpm"
RPM_HASH = "16f8c60253e644b63a1cf74f82559f8bd3ff59998cccd88e4c97f6c84fe277ef613e175c296f55acf26c1f63617ec390c33eb81cb080db1a5c40353de5ad9e51"
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
