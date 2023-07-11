SUMMARY = "Auto Common Utilities"
DESCRIPTION = "Common utilities for creating annotation processors."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-common-1.6.1-1.11.noarch.rpm"
RPM_HASH = "ad57dd0acdbbfd518bfa2f26c3ac25d58037799fc858a19d6404e28e5c4734ef61d504147c24066faf83bd30637f24a0448ff4b3a904bbeaf291fc9b4748019b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-common \
mvn-com.google.auto-auto-common \
mvn-com.google.auto-auto-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava"

inherit rpm
