SUMMARY = "HK2 core module"
DESCRIPTION = "Hundred Kilobytes Kernel core module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-core-2.5.0-2.4.noarch.rpm"
RPM_HASH = "18a4b08d59b1379b03a3e31f981604b61e2c6b8693c0da83e8162d50800364d4af11bf8f3a2596ffb6297defea6c6ebc9dce384d800dbf8963347a47f9d19cc2"
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
