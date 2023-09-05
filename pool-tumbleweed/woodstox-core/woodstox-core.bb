SUMMARY = "XML processor"
DESCRIPTION = "Woodstox is a validating namespace-aware StAX-compliant (JSR-173) XML \
processor written in Java. XML processor means that it handles both \
input (= parsing) and output (= writing, serialization)), as well as \
supporting tasks such as validation."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-6.2.8-2.1.noarch.rpm"
RPM_HASH = "bc0b6dabd9276f639b2de8f70540a52d003b86d447c418451ddc452be5c2b7780c77a6f965a016c26f39492c1a3d063deb4923c7a5816aec1d8c3ed177461a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.fasterxml.woodstox-woodstox-core \
mvn-com.fasterxml.woodstox-woodstox-core-asl \
mvn-com.fasterxml.woodstox-woodstox-core-asl-pom- \
mvn-com.fasterxml.woodstox-woodstox-core-lgpl \
mvn-com.fasterxml.woodstox-woodstox-core-lgpl-pom- \
mvn-com.fasterxml.woodstox-woodstox-core-pom- \
mvn-com.fasterxml.woodstox-wstx-asl \
mvn-com.fasterxml.woodstox-wstx-asl-pom- \
mvn-com.fasterxml.woodstox-wstx-lgpl \
mvn-com.fasterxml.woodstox-wstx-lgpl-pom- \
mvn-org.codehaus.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-woodstox-core-asl \
mvn-org.codehaus.woodstox-woodstox-core-asl-pom- \
mvn-org.codehaus.woodstox-woodstox-core-lgpl \
mvn-org.codehaus.woodstox-woodstox-core-lgpl-pom- \
mvn-org.codehaus.woodstox-woodstox-core-pom- \
mvn-org.codehaus.woodstox-wstx-asl \
mvn-org.codehaus.woodstox-wstx-asl-pom- \
mvn-org.codehaus.woodstox-wstx-lgpl \
mvn-org.codehaus.woodstox-wstx-lgpl-pom- \
osgi-com.fasterxml.woodstox.woodstox-core \
woodstox-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
