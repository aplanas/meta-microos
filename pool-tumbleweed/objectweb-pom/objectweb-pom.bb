SUMMARY = "Objectweb POM"
DESCRIPTION = "This package provides Objectweb parent POM used by different \
Objectweb packages."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "objectweb-pom-1.5-1.11.noarch.rpm"
RPM_HASH = "aad7993f5d2d7567077549d2f0c30d1f42e456bde5267a46a315ec3a996124dc0b38500149f5470decc339702299e731a6811bfc49442c754a2b34eabbc00c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.ow2:ow2:pom:) \
objectweb-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-enforcer-plugin)"

inherit rpm
