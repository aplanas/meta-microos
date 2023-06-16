SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Activation Framework"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_0_2-api-1.2-36.11.noarch.rpm"
RPM_HASH = "04e22c61e6b0c6bb04f1ac9b2f3f3d59928d6df113ee231f08446fec18a8bc90cb0b5a54163a447ae7647b14aa74007daee08c53be08e5d37050ae1a3445616b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "activation-1-0-2-api \
activation-api \
geronimo-jaf-1-0-2-api \
jaf \
jaf-1-0-2-api \
jaf-api \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec \
mvn-org.apache.geronimo.specs-geronimo-activation-1.0.2-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
