SUMMARY = "GlassFishBuild Maven Plugin"
DESCRIPTION = "This plugin provides custom goals used by the GlassFish project build."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-3.2.26-2.11.noarch.rpm"
RPM_HASH = "18827e15b5597be9934453e1c15afb6f0b4615ae25915dc86b31f75d77404af61cdc510a5a6fdc3b8d992cd3b6cc71cc549707c85e5a16192db4fc0218c8f4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin \
mvn-org.glassfish.build-glassfishbuild-maven-plugin \
mvn-org.glassfish.build-glassfishbuild-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-model-builder \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.shared-maven-common-artifact-filters"

inherit rpm
