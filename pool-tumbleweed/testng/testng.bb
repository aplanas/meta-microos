SUMMARY = "Java-based testing framework"
DESCRIPTION = "TestNG is a testing framework inspired from JUnit and NUnit but introducing \
some new functionality, including flexible test configuration, and \
distributed test running.  It is designed to cover unit tests as well as \
functional, end-to-end, integration, etc."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "testng-7.4.0-3.3.noarch.rpm"
RPM_HASH = "a5b6e719c5553ad12dae83de10f01ba4af894db4dbf1356fb26d10878d4d98a612a4b875a4bd960f55c1a762fca3c12aaa95378659c3b344b6a621b7e2c43d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.testng-testng \
mvn-org.testng-testng--jdk15- \
mvn-org.testng-testng-pom- \
mvn-org.testng-testng-pom-jdk15- \
osgi-org.testng \
testng"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.beust-jcommander \
mvn-org.yaml-snakeyaml"

inherit rpm
