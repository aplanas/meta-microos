SUMMARY = "Apache Log4j BOM"
DESCRIPTION = "Apache Log4j 2 Bill of Material"
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-bom-2.17.2-5.8.noarch.rpm"
RPM_HASH = "4d2adec6ffb83f2fac47fd5e1c846d41a514c6f989c620c91eee49b68a1584de916d934723b1c30d54d13ea2e513787f56767271c29e96feae171cf70a957185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-bom \
mvn-org.apache.logging.log4j-log4j-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging-logging-parent-pom-"

inherit rpm
