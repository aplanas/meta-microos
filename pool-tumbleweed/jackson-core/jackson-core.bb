SUMMARY = "Core part of Jackson"
DESCRIPTION = "Core part of Jackson that defines Streaming API as well \
as basic shared abstractions."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-core-2.13.3-1.4.noarch.rpm"
RPM_HASH = "5206e2cd0cb3507bb2014f591c83f561f5a2b5336a7e933331126974265cfbed3d68a3bd3c18092cbb1b6596b808a46b1a307e86b0ccfbbb8308b2832062949a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-core-pom- \
osgi-com.fasterxml.jackson.core.jackson-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
