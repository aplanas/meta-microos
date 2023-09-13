SUMMARY = "Jackson module to inject OSGI services in deserialized beans"
DESCRIPTION = "This module provides a way to inject OSGI services into deserialized objects. \
Thanks to the JacksonInject annotations, the OsgiJacksonModule will search for \
the required service in the OSGI service registry and injects it in the object \
while deserializing."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-osgi-2.15.2-2.1.noarch.rpm"
RPM_HASH = "f1bd7dbe105f7cd08afd223b34a78be5fb05dce9ceb7ffe774b6475b2481e8c6467bd5362e72b5728078eb36a73afc59932005c8b9c5124222610d943d285e57"
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
