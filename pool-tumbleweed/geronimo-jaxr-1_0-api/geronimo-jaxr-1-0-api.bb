SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML Registries (JAXR)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxr-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "f729b0d68d0cd90618a6abb93513fae5b6c66a57fa17c2ddcebd065aaa4375832721873a5ac281168b6d87e7b527e1f2b8c54fbeda77c0e75e627170d7f413fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxr-1-0-api \
jaxr \
jaxr-1-0-api \
jaxr-api \
mvn-org.apache.geronimo.specs-geronimo-jaxr-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jaxr-1.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
