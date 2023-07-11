SUMMARY = "HK2 Run Level Service"
DESCRIPTION = "Hundred Kilobytes Kernel Run Level Service."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-runlevel-2.5.0-2.4.noarch.rpm"
RPM_HASH = "91d2d292c7823348a59e0e493b45ffb9b017ba95996ea309fb2e5405042f0924d170ecd7cd94dc7aeeb2d1280ef83e191cddc7d008fc90407c87a62305dd7209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel-pom- \
osgi-org.glassfish.hk2.runlevel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator"

inherit rpm
