SUMMARY = "A build rule execution framework"
DESCRIPTION = "Enforcer is a build rule execution framework."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-1.4.1-3.11.noarch.rpm"
RPM_HASH = "eced75c40dd4f14d22a5e1daa9a694cd1924f7fc4dc47c7b33aaa4e77d8a8c1d7025b457ddb6b5b9ebfeda83da4473dd83dbafad46bfb2aec93928f97d28271c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer \
mvn-org.apache.maven.enforcer-enforcer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
