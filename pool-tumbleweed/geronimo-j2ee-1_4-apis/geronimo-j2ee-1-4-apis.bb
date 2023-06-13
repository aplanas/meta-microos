SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Specification (the complete set in one jar)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-1_4-apis-1.2-36.11.noarch.rpm"
RPM_HASH = "20a6e08b70c9e6081f83fb20a8fb9031b6f7c16306528417480aa621b901c5008c121831070e457889d969dcaae0a3d1b954be39ef0490ffc32a9a913a9c6dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commonj_1_1_apis \
commonj_apis \
corba_2_3_apis \
corba_apis \
ejb \
ejb_2_1_api \
ejb_api \
geronimo-corba-2_3-apis \
geronimo-j2ee-1_4-apis \
geronimo-qname-1_1-api \
j2ee-connector \
j2ee-deployment \
j2ee-management \
j2ee_connector_1_5_api \
j2ee_connector_api \
j2ee_deployment_1_1_api \
j2ee_deployment_api \
j2ee_management_1_0_api \
j2ee_management_api \
jacc \
jacc_1_0_api \
jacc_api \
jaf \
jaf_1_0_2_api \
jaf_api \
javamail \
javamail_1_3_1_api \
javamail_api \
jaxr \
jaxr_1_0_api \
jaxr_api \
jaxrpc \
jaxrpc_1_1_api \
jaxrpc_api \
jms \
jms_1_1_api \
jms_api \
jsp \
jsp_2_0_api \
jsp_api \
jta \
jta_1_0_1B_api \
jta_api \
mvn(org.apache.geronimo.specs:geronimo-j2ee_1.4_spec) \
mvn(org.apache.geronimo.specs:geronimo-j2ee_1.4_spec:pom:) \
qname_1_1_api \
qname_api \
saaj \
saaj_1_1_api \
saaj_api \
servlet \
servlet_2_4_api \
servlet_api"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
