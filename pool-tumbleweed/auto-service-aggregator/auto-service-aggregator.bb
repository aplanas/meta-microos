SUMMARY = "AutoService Aggregator"
DESCRIPTION = "Aggregator POM for @AutoService."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-aggregator-1.6.1-1.11.noarch.rpm"
RPM_HASH = "18b21bdb8ae126dcf1feeb7f7dd78f098e77f60c24c3f4d47a6c6d6c378c1ec0984d186b00f463df8e5457a8756c478cff400466e5410377fe76172958b9ba7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-aggregator \
mvn-com.google.auto.service-auto-service-aggregator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.oss-oss-parent-pom-"

inherit rpm
