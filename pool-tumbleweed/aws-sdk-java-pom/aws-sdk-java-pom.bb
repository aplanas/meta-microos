SUMMARY = "AWS SDK for Java - Parent POM"
DESCRIPTION = "AWS SDK for Java - Parent POM."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-pom-1.11.3-7.8.noarch.rpm"
RPM_HASH = "62d128fdc3fae9fb66d2819d78f7fb50e267940a10219eba24ad69243a50060437c1283a381223281785d7ccfd3664762d03526e666fd894d6ce531934bab904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-pom \
mvn-com.amazonaws-aws-java-sdk-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
