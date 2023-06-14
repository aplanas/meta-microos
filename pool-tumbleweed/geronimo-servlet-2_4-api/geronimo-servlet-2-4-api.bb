SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Servlet v2.4 API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_4-api-1.2-36.11.noarch.rpm"
RPM_HASH = "fdd4615f028c9506c9bed7aae5566bcf186da6d34e0f2309cd6863088d1da8c31d25f6abffc4d259a75fdb4a14169a009c7cec4d44a15b6936f9cbe04da0d8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-4-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec-pom- \
servlet \
servlet-2-4-api \
servlet-api"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
