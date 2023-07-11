SUMMARY = "HK2 OSGi resource locator bundle"
DESCRIPTION = "Hundred Kilobytes Kernel - OSGi resource locator bundle. Used by \
various API providers that rely on META-INF/services mechanism to \
locate providers."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-osgi-resource-locator-2.5.0-2.4.noarch.rpm"
RPM_HASH = "6d07d3cec665a36cebea99c3b6bee96ec56552021bd0d77c51eed872659501eb3aa72f30498c4a66a32b5d462869646e0cd50fc3061392c06835c724d420f73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator-pom- \
osgi-org.glassfish.hk2.osgi-resource-locator \
osgi-resource-locator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
