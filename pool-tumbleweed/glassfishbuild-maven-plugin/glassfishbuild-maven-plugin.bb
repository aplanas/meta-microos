SUMMARY = "GlassFishBuild Maven Plugin"
DESCRIPTION = "This plugin provides custom goals used by the GlassFish project build."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-3.2.26-2.10.noarch.rpm"
RPM_HASH = "a3c0493cd0b9037a6c4b53c870709a1b02c7deb499c34f9e7b428d482eb4e3ec8dac5083ab763cc3ac706a8eb0a7ed214d116c64d0e8c14b4a05a156bd16f3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin \
mvn(org.glassfish.build:glassfishbuild-maven-plugin) \
mvn(org.glassfish.build:glassfishbuild-maven-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(org.apache.maven.plugin-tools:maven-plugin-annotations) \
mvn(org.apache.maven.shared:maven-common-artifact-filters) \
mvn(org.apache.maven:maven-aether-provider) \
mvn(org.apache.maven:maven-archiver) \
mvn(org.apache.maven:maven-compat) \
mvn(org.apache.maven:maven-model-builder)"

inherit rpm
