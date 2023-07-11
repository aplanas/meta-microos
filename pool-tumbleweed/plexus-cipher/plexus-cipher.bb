SUMMARY = "Plexus Cipher: encryption/decryption Component"
DESCRIPTION = "Plexus Cipher: encryption/decryption Component"
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-cipher-2.0-2.8.noarch.rpm"
RPM_HASH = "b86dbd0b7842e3b4ac5196eb874fb05f776bf0fd8b978d2f84db0bf87309efd7b73f4b549e14c0ec28abcf9155680fc3aee1f49a9772f88c1b67cc3f2240d6ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-cipher-pom- \
mvn-org.sonatype.plexus-plexus-cipher \
mvn-org.sonatype.plexus-plexus-cipher-pom- \
plexus-cipher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject"

inherit rpm
