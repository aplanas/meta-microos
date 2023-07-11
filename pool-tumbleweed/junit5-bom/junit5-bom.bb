SUMMARY = "JUnit 5 (Bill of Materials)"
DESCRIPTION = "This Bill of Materials POM can be used to ease dependency management \
when referencing multiple JUnit artifacts using Gradle or Maven."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-bom-5.8.2-1.10.noarch.rpm"
RPM_HASH = "6773dda6bc87b2afaadcdc7916f5a352b74f8500d1d3dc9a763283033c79c98dceda2a81f2c2b63b40da0669020f38490adfac9a57d6cdc6da010fafa4b51777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-bom \
mvn-org.junit-junit-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
