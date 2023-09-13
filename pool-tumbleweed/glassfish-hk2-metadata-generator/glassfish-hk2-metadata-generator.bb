SUMMARY = "HK2 Metadata Generator"
DESCRIPTION = "HK2 Metadata Generator Subsystem."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-metadata-generator-2.5.0-4.1.noarch.rpm"
RPM_HASH = "dc0e17fdbe020c9770b851d27931820de82720ee8444b2334c53a125aebb88fef4e7e9ceba1918973bce43596514ba81d862963decce7cef55fdbb45df6d6ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-metadata-generator-parent-pom- \
mvn-org.glassfish.hk2-hk2-metadata-generator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
