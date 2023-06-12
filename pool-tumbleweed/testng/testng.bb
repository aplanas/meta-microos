SUMMARY = "Java-based testing framework"
DESCRIPTION = "TestNG is a testing framework inspired from JUnit and NUnit but introducing \
some new functionality, including flexible test configuration, and \
distributed test running.  It is designed to cover unit tests as well as \
functional, end-to-end, integration, etc."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "testng-7.4.0-3.2.noarch.rpm"
RPM_HASH = "cd3303bc64e312e25291af919408c1652e543da97d0750dddd4f33a851fd3bb685d2c0ef08261143ab61eeaaac2564c493f76f3a24dff4e621ac8a64d564b051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.testng:testng) \
mvn(org.testng:testng::jdk15:) \
mvn(org.testng:testng:pom:) \
mvn(org.testng:testng:pom:jdk15:) \
osgi(org.testng) \
testng"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.beust:jcommander) \
mvn(org.yaml:snakeyaml)"

inherit rpm
