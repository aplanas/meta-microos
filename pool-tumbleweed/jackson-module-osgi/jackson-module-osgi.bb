SUMMARY = "Jackson module to inject OSGI services in deserialized beans"
DESCRIPTION = "This module provides a way to inject OSGI services into deserialized objects. \
Thanks to the JacksonInject annotations, the OsgiJacksonModule will search for \
the required service in the OSGI service registry and injects it in the object \
while deserializing."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-osgi-2.15.2-1.1.noarch.rpm"
RPM_HASH = "03c0b3380e700c6fd6412632aaaedf9243bff53c120c3dd3149ccc4941527f5c8d2ae12a34969b16e05badcc1e0e69bff8c6b330f8d396f50f74e55e4c57267d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-osgi \
mvn-com.fasterxml.jackson.module-jackson-module-osgi \
mvn-com.fasterxml.jackson.module-jackson-module-osgi-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-osgi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.osgi-osgi.core"

inherit rpm
