SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML Registries (JAXR)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxr-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "4dfc7476105332f7dd5bbc7388eb033b528bea86b267ad2988a31e1cfa701b1514299b763bee6d7345d797a01b2f39545f493049c86c6fe4d95e63610aeccd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxr-1_0-api \
jaxr \
jaxr_1_0_api \
jaxr_api \
mvn(org.apache.geronimo.specs:geronimo-jaxr_1.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-jaxr_1.0_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
jaf_1_0_2_api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
