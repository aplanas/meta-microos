SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Transaction API Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_0_1B-api-1.2-36.11.noarch.rpm"
RPM_HASH = "4e1c3d757a30746ef75b9f448bfc5899a98c6cc9ca8e0eef5e6c383e4c92d451a78ed10d4247244c1305bd7c30d6556e0b7a9a68428fbc4fc0bda6b3b4316844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1_0_1B-api \
jta \
jta_1_0_1B_api \
jta_api \
mvn(org.apache.geronimo.specs:geronimo-jta_1.0.1B_spec) \
mvn(org.apache.geronimo.specs:geronimo-jta_1.0.1B_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
