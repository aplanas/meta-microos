SUMMARY = "HK2 configuration modules"
DESCRIPTION = "Hundred Kilobytes Kernel configuration modules."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-configuration-2.5.0-2.3.noarch.rpm"
RPM_HASH = "f2fb924d0be4ca8ad1065d5592e4aca256eb58842c8e60aac053f0a584cb86a53960875bda096618625c486ba2d41460248a39c233697ba908f33d2b6a7df672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-configuration \
mvn(org.glassfish.hk2:hk2-configuration-hub) \
mvn(org.glassfish.hk2:hk2-configuration-hub:pom:) \
mvn(org.glassfish.hk2:hk2-configuration-integration) \
mvn(org.glassfish.hk2:hk2-configuration-integration:pom:) \
mvn(org.glassfish.hk2:hk2-configuration-persistence:pom:) \
mvn(org.glassfish.hk2:hk2-configuration:pom:) \
mvn(org.glassfish.hk2:hk2-property-file) \
mvn(org.glassfish.hk2:hk2-property-file:pom:) \
osgi(org.glassfish.hk2.configuration-hub) \
osgi(org.glassfish.hk2.configuration-integration) \
osgi(org.glassfish.hk2.property-file)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.annotation:javax.annotation-api) \
mvn(org.glassfish.hk2:hk2-api) \
mvn(org.glassfish.hk2:hk2-locator) \
mvn(org.glassfish.hk2:hk2-utils)"

inherit rpm
