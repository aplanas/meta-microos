SUMMARY = "Log4j implemented over SLF4J"
DESCRIPTION = "Log4j implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "log4j-over-slf4j-1.7.36-4.2.noarch.rpm"
RPM_HASH = "1aee2e1aa9f742b8d3a55a6800a04952afa5e2007376d8b201c50dd90bee278c68fd787e00957c383aeb628fee7297ce22121bdde5deceff58a715680b2a234a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-over-slf4j \
mvn-org.slf4j-log4j-over-slf4j \
mvn-org.slf4j-log4j-over-slf4j-pom- \
osgi-log4j.over.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
