SUMMARY = "SLF4J Source JARs"
DESCRIPTION = "SLF4J Source JARs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-sources-1.7.36-4.1.noarch.rpm"
RPM_HASH = "3b206426ccc4eeb952ee61735ca2de6034b5872760aeda7b7358cc6a4500e1feb69e78f643b47a79ff0bf86fb463438186b67227dcdfd9ea4a774e7e1e1cc1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:jcl-over-slf4j::sources:) \
mvn(org.slf4j:jul-to-slf4j::sources:) \
mvn(org.slf4j:log4j-over-slf4j::sources:) \
mvn(org.slf4j:slf4j-api::sources:) \
mvn(org.slf4j:slf4j-ext::sources:) \
mvn(org.slf4j:slf4j-jcl::sources:) \
mvn(org.slf4j:slf4j-jdk14::sources:) \
mvn(org.slf4j:slf4j-log4j12::sources:) \
mvn(org.slf4j:slf4j-nop::sources:) \
mvn(org.slf4j:slf4j-reload4j::sources:) \
mvn(org.slf4j:slf4j-simple::sources:) \
slf4j-sources"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
