SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Activation Framework"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_0_2-api-1.2-37.1.noarch.rpm"
RPM_HASH = "dc524c6cfefd82cb564a18934687c8166534335dc87c1ea527fd0efed44f15065563f538cea907145eddbd5f46ea073e21560788dee8f07fc38c5aa8052db45e"
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
