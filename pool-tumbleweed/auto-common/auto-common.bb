SUMMARY = "Auto Common Utilities"
DESCRIPTION = "Common utilities for creating annotation processors."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-common-1.6.1-1.10.noarch.rpm"
RPM_HASH = "56ad7a80951a5b844d3524817cdc9f6341f88dd939f97c56d2dbaf3a5a90852e0e4f4398f7199cf5a2e27cd434dd308d923f47e689ea1a8193affacdd595972a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-common \
mvn(com.google.auto:auto-common) \
mvn(com.google.auto:auto-common:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.guava:guava)"

inherit rpm
