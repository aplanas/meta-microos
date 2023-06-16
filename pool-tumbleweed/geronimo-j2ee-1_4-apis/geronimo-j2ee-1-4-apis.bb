SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Specification (the complete set in one jar)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-1_4-apis-1.2-36.11.noarch.rpm"
RPM_HASH = "20a6e08b70c9e6081f83fb20a8fb9031b6f7c16306528417480aa621b901c5008c121831070e457889d969dcaae0a3d1b954be39ef0490ffc32a9a913a9c6dd4"
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
