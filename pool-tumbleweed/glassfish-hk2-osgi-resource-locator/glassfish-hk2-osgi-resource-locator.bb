SUMMARY = "HK2 OSGi resource locator bundle"
DESCRIPTION = "Hundred Kilobytes Kernel - OSGi resource locator bundle. Used by \
various API providers that rely on META-INF/services mechanism to \
locate providers."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-osgi-resource-locator-2.5.0-4.1.noarch.rpm"
RPM_HASH = "512144dadc27d25a9387539f3df90c1bbcb88127b72bb687a776f1c7bd88959ed5719e0a21a0adc1655f720d6718072f382865128ba58432e37fdf3fdb496cdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator-pom- \
osgi-org.glassfish.hk2.osgi-resource-locator \
osgi-resource-locator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
