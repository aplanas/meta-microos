SUMMARY = "Java logging package"
DESCRIPTION = "Log4j is a tool to help the programmer output log statements to a \
variety of output targets."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-2.17.2-5.7.noarch.rpm"
RPM_HASH = "ce9a68c2837782ae092e2f56c8f7031165355b4eb22c37f48bab78c96a0ca409bb5e77cd8c21ffa4c18d481348e3284cbd90c3121e6381f3001a817a9d4cc662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j \
mvn(org.apache.logging.log4j:log4j-1.2-api) \
mvn(org.apache.logging.log4j:log4j-1.2-api:pom:) \
mvn(org.apache.logging.log4j:log4j-api) \
mvn(org.apache.logging.log4j:log4j-api-java9:pom:) \
mvn(org.apache.logging.log4j:log4j-api:pom:) \
mvn(org.apache.logging.log4j:log4j-core) \
mvn(org.apache.logging.log4j:log4j-core-java9:pom:) \
mvn(org.apache.logging.log4j:log4j-core:pom:) \
mvn(org.apache.logging.log4j:log4j-docker) \
mvn(org.apache.logging.log4j:log4j-docker:pom:) \
mvn(org.apache.logging.log4j:log4j-iostreams) \
mvn(org.apache.logging.log4j:log4j-iostreams:pom:) \
mvn(org.apache.logging.log4j:log4j-jakarta-web) \
mvn(org.apache.logging.log4j:log4j-jakarta-web:pom:) \
mvn(org.apache.logging.log4j:log4j-jpl) \
mvn(org.apache.logging.log4j:log4j-jpl:pom:) \
mvn(org.apache.logging.log4j:log4j-jul) \
mvn(org.apache.logging.log4j:log4j-jul:pom:) \
mvn(org.apache.logging.log4j:log4j-layout-template-json) \
mvn(org.apache.logging.log4j:log4j-layout-template-json:pom:) \
mvn(org.apache.logging.log4j:log4j-osgi) \
mvn(org.apache.logging.log4j:log4j-osgi:pom:) \
mvn(org.apache.logging.log4j:log4j-to-jul) \
mvn(org.apache.logging.log4j:log4j-to-jul:pom:) \
mvn(org.apache.logging.log4j:log4j:pom:) \
osgi(org.apache.logging.log4j.1.2-api) \
osgi(org.apache.logging.log4j.api) \
osgi(org.apache.logging.log4j.core) \
osgi(org.apache.logging.log4j.docker) \
osgi(org.apache.logging.log4j.iostreams) \
osgi(org.apache.logging.log4j.jakarta-web) \
osgi(org.apache.logging.log4j.jpl) \
osgi(org.apache.logging.log4j.jul) \
osgi(org.apache.logging.log4j.layout.template.json) \
osgi(org.apache.logging.log4j.osgi) \
osgi(org.apache.logging.log4j.to-jul)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-annotations) \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(javax.activation:javax.activation-api)"

inherit rpm
