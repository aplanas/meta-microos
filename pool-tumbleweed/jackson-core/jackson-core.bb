SUMMARY = "Core part of Jackson"
DESCRIPTION = "Core part of Jackson that defines Streaming API as well \
as basic shared abstractions."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-core-2.15.2-1.1.noarch.rpm"
RPM_HASH = "b27a09631a376dab3eced373c6f9c4425ab1391bdbe3b4a558c4f8b2ae44f5030b7a5e6751e9f47b5f3197b12a4e39799a2d113ea451ce00ee67dfd9feef4845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core-pom- \
osgi-com.fasterxml.jackson.core.jackson-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
