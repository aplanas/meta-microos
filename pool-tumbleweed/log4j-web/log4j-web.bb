SUMMARY = "Apache Log4j Web"
DESCRIPTION = "Support for Log4j in a web servlet container."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-web-2.17.2-5.8.noarch.rpm"
RPM_HASH = "86645745675068a6e52e7a452da651ba249ec005a40a3e7c512d072199d0b82865c18f5ee83fe470aad45fa3f3cce06a57bee0ad025967808a8c6f19ad0e8580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-web \
mvn-org.apache.logging.log4j-log4j-web \
mvn-org.apache.logging.log4j-log4j-web-pom- \
osgi-org.apache.logging.log4j.web"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core"

inherit rpm
