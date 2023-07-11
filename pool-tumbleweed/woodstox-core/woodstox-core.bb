SUMMARY = "XML processor"
DESCRIPTION = "Woodstox is a validating namespace-aware StAX-compliant (JSR-173) XML \
processor written in Java. XML processor means that it handles both \
input (= parsing) and output (= writing, serialization)), as well as \
supporting tasks such as validation."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-6.2.8-1.9.noarch.rpm"
RPM_HASH = "d297fc97f1de260d7a55c2ebd3380c7e38975828d3265185e6466be86eda9f32e6b0aa389fde5c176fd4279807067cc9a355f882564d78c9851a0578fb6e70af"
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
