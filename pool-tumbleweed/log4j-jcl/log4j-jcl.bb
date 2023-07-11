SUMMARY = "Apache Log4j Commons Logging Bridge"
DESCRIPTION = "Apache Log4j Commons Logging Bridge."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-jcl-2.17.2-5.8.noarch.rpm"
RPM_HASH = "f3df989883ea87c59d4ac55ac90fb656ad3fa7546ebca201f5362410c1ab90ce064703cfb84cd157da8911495bba23a1eaf725190257daa25a33996d5739b9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-jcl \
mvn-org.apache.logging.log4j-log4j-jcl \
mvn-org.apache.logging.log4j-log4j-jcl-pom- \
osgi-org.apache.logging.log4j.jcl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.logging.log4j-log4j-api"

inherit rpm
