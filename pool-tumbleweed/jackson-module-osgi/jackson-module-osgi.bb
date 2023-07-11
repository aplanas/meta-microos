SUMMARY = "Jackson module to inject OSGI services in deserialized beans"
DESCRIPTION = "This module provides a way to inject OSGI services into deserialized objects. \
Thanks to the JacksonInject annotations, the OsgiJacksonModule will search for \
the required service in the OSGI service registry and injects it in the object \
while deserializing."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-osgi-2.13.3-1.8.noarch.rpm"
RPM_HASH = "19b0b1f65692283fb6694e916d82480dee8f0009f426f33710bc9f8f052f3c8a62152cdf50b91a3e890fe6d98fc33eb8d5fbfe8c65c849123d82d93ccb1f290f"
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
