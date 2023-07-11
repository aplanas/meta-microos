SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Specification (the complete set in one jar)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-1_4-apis-1.2-36.12.noarch.rpm"
RPM_HASH = "1156baec0fd7375510c259f7d3cb2aac84dd7e75af92c77472d4017eb2828a7d5408f94f8f8609814315c56b9a900d101a345e4e69b4c324228d5f1ab7eb8c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commonj-1-1-apis \
commonj-apis \
corba-2-3-apis \
corba-apis \
ejb \
ejb-2-1-api \
ejb-api \
geronimo-corba-2-3-apis \
geronimo-j2ee-1-4-apis \
geronimo-qname-1-1-api \
j2ee-connector \
j2ee-connector-1-5-api \
j2ee-connector-api \
j2ee-deployment \
j2ee-deployment-1-1-api \
j2ee-deployment-api \
j2ee-management \
j2ee-management-1-0-api \
j2ee-management-api \
jacc \
jacc-1-0-api \
jacc-api \
jaf \
jaf-1-0-2-api \
jaf-api \
javamail \
javamail-1-3-1-api \
javamail-api \
jaxr \
jaxr-1-0-api \
jaxr-api \
jaxrpc \
jaxrpc-1-1-api \
jaxrpc-api \
jms \
jms-1-1-api \
jms-api \
jsp \
jsp-2-0-api \
jsp-api \
jta \
jta-1-0-1B-api \
jta-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-1.4-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-1.4-spec-pom- \
qname-1-1-api \
qname-api \
saaj \
saaj-1-1-api \
saaj-api \
servlet \
servlet-2-4-api \
servlet-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
