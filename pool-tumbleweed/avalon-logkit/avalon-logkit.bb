SUMMARY = "Java logging toolkit"
DESCRIPTION = "LogKit is a logging toolkit designed for secure performance oriented \
logging in applications. To get started using LogKit, it is recomended \
that you read the whitepaper and browse the API docs."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-2.1-25.1.noarch.rpm"
RPM_HASH = "8e07c2eadc6862d9b3115c76ee3adce856223dd8ed716f5b172148cf3bfe5cd7c4c70fdfe14164dea7420010d8a0333c4b417bc1f271f1bc0f23e260c1f902bf"
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
