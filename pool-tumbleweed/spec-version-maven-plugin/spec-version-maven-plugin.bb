SUMMARY = "Spec Version Maven Plugin"
DESCRIPTION = "Maven Plugin to configure APIs version and \
specs in a MANIFEST.MF file."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-2.1-1.10.noarch.rpm"
RPM_HASH = "0f1e8f30abd491422158c4648e173a180de1773e719d6c9dc29b5d0d2d0092be6194f4b534dc473932d8cf423c1485edebad817ef4f132efee07423226aa9479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.glassfish.build-spec-version-maven-plugin \
mvn-org.glassfish.build-spec-version-maven-plugin-pom- \
spec-version-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations"

inherit rpm
