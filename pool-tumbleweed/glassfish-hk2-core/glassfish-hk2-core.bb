SUMMARY = "HK2 core module"
DESCRIPTION = "Hundred Kilobytes Kernel core module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-core-2.5.0-4.1.noarch.rpm"
RPM_HASH = "f08553da6e294107b076d10c5a01e6dacb6d085755592f2203b59a4095272ddd1b12b740f72b2c4ac06dcecfcfb02fb2ec2edfe5afef32daa670565c99e7b000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-core \
mvn-org.glassfish.hk2-hk2-core \
mvn-org.glassfish.hk2-hk2-core-pom- \
osgi-org.glassfish.hk2.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
