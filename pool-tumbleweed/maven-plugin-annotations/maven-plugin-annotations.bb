SUMMARY = "Maven Plugin Java 5 Annotations"
DESCRIPTION = "This package contains Java 5 annotations to use in Mojos."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-annotations-3.6.0-6.1.noarch.rpm"
RPM_HASH = "e3106f6ef6a1ee8b9c8500cc58ad93a5f022ed202ea6b1e0190c15186430709d43a3f8c0efb8e1f44c9a5b08d8dfe9afebcb3cdffcb61a7f59340ff5142dd6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact"

inherit rpm
