SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JMS Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jms-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "ff51ad4a0184eda48903cbe08f891dd781e538de956508ff149770bdab94fe52b3290539edf5bb5d992f7dfb224f24007d5ab443a03ac0dc32ee50ab1983ba29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jms-1_1-api \
jms \
jms_1_1_api \
jms_api \
mvn(javax.jms:jms) \
mvn(javax.jms:jms:pom:) \
mvn(org.apache.geronimo.specs:geronimo-jms_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-jms_1.1_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
