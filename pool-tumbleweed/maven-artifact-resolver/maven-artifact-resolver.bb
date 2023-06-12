SUMMARY = "Maven Artifact Resolution API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "maven-artifact-resolver-1.0-3.10.noarch.rpm"
RPM_HASH = "1f8a001031d69cea4c54159899da00989d112f98c6110e4547b2533ef27b7f1f0573ebf8066e77467e3db4b3bfb8c79ced599e14a17e652e081218cd0dc3b955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-resolver \
mvn(org.apache.maven.shared:maven-artifact-resolver) \
mvn(org.apache.maven.shared:maven-artifact-resolver:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-compat)"

inherit rpm
