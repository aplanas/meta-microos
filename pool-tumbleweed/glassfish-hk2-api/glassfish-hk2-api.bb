SUMMARY = "HK2 API module"
DESCRIPTION = "Hundred Kilobytes Kernel API module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-api-2.5.0-4.1.noarch.rpm"
RPM_HASH = "10a2676e0f1be1b50d622777e30ead1f66996bcef53c2c133b3a3fe9defd4af2200724945a806f2af422b75f13c54acc701462d3e86b0f0dc673632a2a4506d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-api-pom- \
osgi-org.glassfish.hk2.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
