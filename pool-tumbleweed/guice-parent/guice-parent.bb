SUMMARY = "Guice parent POM"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides parent POM for Guice modules."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-parent-5.1.0-1.1.noarch.rpm"
RPM_HASH = "2acb37c41592fe4c8a5c744fc6b40fbd3f36c9ab59d6abda5463f459bf453162640d02c39763eed36afbca0c634ee6db3a3fd9e039cad4119fe6716edaed1857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-parent \
mvn(com.google.inject:guice-parent:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
