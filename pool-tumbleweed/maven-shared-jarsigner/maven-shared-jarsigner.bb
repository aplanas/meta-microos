SUMMARY = "Component to assist in signing Java archives"
DESCRIPTION = "Apache Maven Jarsigner is a component which provides utilities to sign \
and verify Java archive and other files in your Maven MOJOs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-3.0.0-2.22.noarch.rpm"
RPM_HASH = "b7709ad0fce6505f7354e92f87dd6da47df8a86b6b4eb0b5e9efa9afe66e2eca23cb67a04a5de22f15b556336787f4ee01734ea0149715f5c8612a39678beddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner \
mvn-org.apache.maven.shared-maven-jarsigner \
mvn-org.apache.maven.shared-maven-jarsigner-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
