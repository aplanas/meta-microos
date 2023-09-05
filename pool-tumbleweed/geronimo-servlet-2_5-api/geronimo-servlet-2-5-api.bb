SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_5-api-1.2-37.1.noarch.rpm"
RPM_HASH = "c5d4e5f9b596f5cae23ab2c362bc0e9e52d58ad617fe1d5fc8b3318d425c7ff2f6200352578d6c26dba574706944a49eda9866069c865ad0a9b5cde1f1a84e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-5-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec-pom- \
servlet \
servlet-2-5-api \
servlet-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
