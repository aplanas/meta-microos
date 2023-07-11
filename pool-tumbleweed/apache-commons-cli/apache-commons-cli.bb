SUMMARY = "Command Line Interface Library for Java"
DESCRIPTION = "The CLI library provides an API for working with the \
command line arguments and options."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-cli-1.5.0-1.8.noarch.rpm"
RPM_HASH = "a6de83925b80c4b43fe7e35eeb01f3553963b609375ca4db895a28b2657250e1beedc38f7c1eb956d717260d1cc01fd4ee80a5eb0eee61faf2f893ed89d3e0ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-cli \
apache-commons-cli \
jakarta-commons-cli \
mvn-commons-cli-commons-cli \
mvn-commons-cli-commons-cli-pom- \
mvn-org.apache.commons-commons-cli \
mvn-org.apache.commons-commons-cli-pom- \
osgi-org.apache.commons.cli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
