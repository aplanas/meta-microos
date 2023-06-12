SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaServer Pages Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "6753ffcd28c34272277bd3b1d267f0f62f0d3b634688598a02e552c88092a9df474815027e017fc460c23961935260635cf10200c11b4174456254cb1c66ed02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2_0-api \
jsp \
jsp_2_0_api \
jsp_api \
mvn(org.apache.geronimo.specs:geronimo-jsp_2.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-jsp_2.0_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
servlet_2_4_api \
update-alternatives"

inherit rpm
