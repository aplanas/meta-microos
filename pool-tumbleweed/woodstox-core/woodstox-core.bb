SUMMARY = "XML processor"
DESCRIPTION = "Woodstox is a validating namespace-aware StAX-compliant (JSR-173) XML \
processor written in Java. XML processor means that it handles both \
input (= parsing) and output (= writing, serialization)), as well as \
supporting tasks such as validation."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-6.2.8-3.1.noarch.rpm"
RPM_HASH = "e6261238ed1d96f90ef494efe42a80d834030ce7386800de49263c99460c5f6c092efc22f30e3b9f4d192c6251358dae7b1d7cd97ee3659d60ea893faf092ffd"
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
