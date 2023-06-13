SUMMARY = "Log4j implemented over SLF4J"
DESCRIPTION = "Log4j implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "log4j-over-slf4j-1.7.36-4.1.noarch.rpm"
RPM_HASH = "d9bfbb5b97bdf001e1501c4059d712d73fa823c5059937e46caf65fc61b7903b327742409ce3f65f975bcca2fb253f7d75e4d36e933f5840e5cf5790b3dc519a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-over-slf4j \
mvn(org.slf4j:log4j-over-slf4j) \
mvn(org.slf4j:log4j-over-slf4j:pom:) \
osgi(log4j.over.slf4j)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api)"

inherit rpm
