SUMMARY = "Sisu inject"
DESCRIPTION = "This package contains Sisu inject."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-inject-0.3.5-3.5.noarch.rpm"
RPM_HASH = "4f418b2481973457bba22299e2ea2d3c034c7ccaebee28ae14f583dc0f4d2dcc5ee10e5ab229015be9d7c5bb93788cc756d3e07b7ed1927f199a4c6136a65cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.eclipse.sisu:org.eclipse.sisu.inject) \
mvn(org.eclipse.sisu:org.eclipse.sisu.inject:pom:) \
sisu-inject"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.enterprise:cdi-api)"

inherit rpm
