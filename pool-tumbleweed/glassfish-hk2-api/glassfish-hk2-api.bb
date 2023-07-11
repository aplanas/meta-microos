SUMMARY = "HK2 API module"
DESCRIPTION = "Hundred Kilobytes Kernel API module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-api-2.5.0-2.4.noarch.rpm"
RPM_HASH = "9f768ae7292fa0f8877928eb6e4657a26b1da62e93fd07489c0dc940030dd1c5531a46a4f37a5d1b3f8ca0405efccc32e5c7065d09775d784a875e25f1ce3d40"
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
