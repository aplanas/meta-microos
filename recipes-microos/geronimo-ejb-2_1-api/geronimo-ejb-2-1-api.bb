SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Enterprise JavaBeans Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-2_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "157117647a148802252edbe55cbe1fda7a7ece81ad5997177df8fc9ffc8cb887d16dd1ae9b5bf2b985cb58fb23bad8af0bbb8e8725c1f90ef506d353287d9a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ejb \
ejb_2_1_api \
ejb_api \
geronimo-ejb-2_1-api \
mvn(org.apache.geronimo.specs:geronimo-ejb_2.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-ejb_2.1_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
jta_1_0_1B_api \
update-alternatives"

inherit rpm
