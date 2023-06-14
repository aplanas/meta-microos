SUMMARY = "AutoService Aggregator"
DESCRIPTION = "Aggregator POM for @AutoService."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-aggregator-1.6.1-1.10.noarch.rpm"
RPM_HASH = "31e78dce57058690305e12a16ac73420c4c31885bf56e72ee4eff5183b690050ee015a42c49a7dee26eff5e59a1cc5dfdc1be50da5a8cd8f055b3fbb3261c703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-aggregator \
mvn-com.google.auto.service-auto-service-aggregator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.oss-oss-parent-pom-"

inherit rpm
