SUMMARY = "HK2 extras module"
DESCRIPTION = "Default implementations for HK2 services."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-extras-2.5.0-2.3.noarch.rpm"
RPM_HASH = "a689a5accbce5e0edc8260b42936eac850956cf50db57dc1f9e8821704acb370e6e672313c39aaf113abfdf3686fdabd6cb3e08157a2afb03bbb3575202f18e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras-pom- \
osgi-org.glassfish.hk2.extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
