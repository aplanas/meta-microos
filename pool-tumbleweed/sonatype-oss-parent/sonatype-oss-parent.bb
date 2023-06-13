SUMMARY = "Sonatype OSS Parent"
DESCRIPTION = "Sonatype OSS parent pom used by other sonatype packages."
LICENSE = "Apache-2.0"

PV = "7"

RPM_NAME = "sonatype-oss-parent-7-2.11.noarch.rpm"
RPM_HASH = "10eb5e69a5aed70e0298a60c6e255815184b1a8927336432498a53b789740d1f765769eccc0eee8998536da8fbb947f61536eafe0152ec0ddb1a966aa9e24454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.sonatype.oss:oss-parent:pom:) \
sonatype-oss-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
