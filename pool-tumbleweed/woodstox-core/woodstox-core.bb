SUMMARY = "XML processor"
DESCRIPTION = "Woodstox is a validating namespace-aware StAX-compliant (JSR-173) XML \
processor written in Java. XML processor means that it handles both \
input (= parsing) and output (= writing, serialization)), as well as \
supporting tasks such as validation."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-6.2.8-1.8.noarch.rpm"
RPM_HASH = "0ddb3e0c17684dfebaace154abeb81eb1538028eca400f5ece9171c5069319741eafc58410e31a58a18f7b4c57723d4951189ac45639a76bfafd533b00d9c8c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.fasterxml.woodstox:woodstox-core) \
mvn(com.fasterxml.woodstox:woodstox-core-asl) \
mvn(com.fasterxml.woodstox:woodstox-core-asl:pom:) \
mvn(com.fasterxml.woodstox:woodstox-core-lgpl) \
mvn(com.fasterxml.woodstox:woodstox-core-lgpl:pom:) \
mvn(com.fasterxml.woodstox:woodstox-core:pom:) \
mvn(com.fasterxml.woodstox:wstx-asl) \
mvn(com.fasterxml.woodstox:wstx-asl:pom:) \
mvn(com.fasterxml.woodstox:wstx-lgpl) \
mvn(com.fasterxml.woodstox:wstx-lgpl:pom:) \
mvn(org.codehaus.woodstox:woodstox-core) \
mvn(org.codehaus.woodstox:woodstox-core-asl) \
mvn(org.codehaus.woodstox:woodstox-core-asl:pom:) \
mvn(org.codehaus.woodstox:woodstox-core-lgpl) \
mvn(org.codehaus.woodstox:woodstox-core-lgpl:pom:) \
mvn(org.codehaus.woodstox:woodstox-core:pom:) \
mvn(org.codehaus.woodstox:wstx-asl) \
mvn(org.codehaus.woodstox:wstx-asl:pom:) \
mvn(org.codehaus.woodstox:wstx-lgpl) \
mvn(org.codehaus.woodstox:wstx-lgpl:pom:) \
osgi(com.fasterxml.woodstox.woodstox-core) \
woodstox-core"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.woodstox:stax2-api)"

inherit rpm
