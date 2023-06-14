SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Connector Architecture Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-connector-1_5-api-1.2-36.11.noarch.rpm"
RPM_HASH = "233abd988120f8b5837cf6c3d983b24d5f6f839e842522b00e6f4ddac2b89ff654cf27c287c826ac9b3e749775c449054329965ea62983f1e4e2822bd103ef8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-connector-1-5-api \
j2ee-connector \
j2ee-connector-1-5-api \
j2ee-connector-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec-pom-"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
jta-1-0-1B-api \
update-alternatives"

inherit rpm
