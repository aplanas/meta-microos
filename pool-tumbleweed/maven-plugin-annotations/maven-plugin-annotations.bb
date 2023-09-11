SUMMARY = "Maven Plugin Java 5 Annotations"
DESCRIPTION = "This package contains Java 5 annotations to use in Mojos."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-annotations-3.6.0-7.1.noarch.rpm"
RPM_HASH = "0f8c67caa4b0b0c2de8de491c7d91d0c8fdfe966c53a6bb00a99ce674dd3176e3a85a4c435233af4f63f24565c25d6be9ab28fe4429479cab55e7433e9087f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact"

inherit rpm
