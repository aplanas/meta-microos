SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaServer Pages Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "40ec644f7c69cd77c409ec5a949421e19a48f5bd0fdd057f3628807c4cc7e73c4e7cf794b68ba790dfbd1c21d8a5aaf4c8716a38df55bc9b99f6b911a1b6cc79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2-0-api \
jsp \
jsp-2-0-api \
jsp-api \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
servlet-2-4-api \
update-alternatives"

inherit rpm
