SUMMARY = "Concurrency JSR-166 - Collections supporting parallel operations"
DESCRIPTION = "Implementation of Java collections supporting parallel operations using \
Fork-Join concurrent framework provided by JSR-166."
LICENSE = "SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-1.7.0-3.10.noarch.rpm"
RPM_HASH = "c4dcda2c48140bc78f521f5d72044a8ca9ccab4a50e6972e8fd41e5aa59eaf125dc3d882c7afa46707ec24386713ed30c8c77463e63529f1a2f12652f7aa720b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y \
mvn-org.codehaus.jsr166-mirror-extra166y \
mvn-org.codehaus.jsr166-mirror-extra166y-pom- \
osgi-extra166y"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
