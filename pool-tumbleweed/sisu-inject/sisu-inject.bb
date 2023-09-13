SUMMARY = "Sisu inject"
DESCRIPTION = "This package contains Sisu inject."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-inject-0.3.5-4.1.noarch.rpm"
RPM_HASH = "82b6ea6e6a2dc468fdf1f9b374f9855c104c20f698fe08232d86381008d6ad0bfba81aaaff84daf95b53a4b3842c4dab900fdcaf7fdd184e4a88bd7bf050c6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject-pom- \
sisu-inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.enterprise-cdi-api"

inherit rpm
