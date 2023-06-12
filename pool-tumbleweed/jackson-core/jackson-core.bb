SUMMARY = "Core part of Jackson"
DESCRIPTION = "Core part of Jackson that defines Streaming API as well \
as basic shared abstractions."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-core-2.13.3-1.3.noarch.rpm"
RPM_HASH = "ad08f6efabc78c875af0e177185645cf6d3529a417964695fd5a416bfe3fea030e3570186a39713bb7ce9b6fe6a4d61630f23f63e58a2f0bde1c124813624750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-core:pom:) \
osgi(com.fasterxml.jackson.core.jackson-core)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
