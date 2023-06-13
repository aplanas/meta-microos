SUMMARY = "Plexus Cipher: encryption/decryption Component"
DESCRIPTION = "Plexus Cipher: encryption/decryption Component"
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-cipher-2.0-2.7.noarch.rpm"
RPM_HASH = "0c6edd7115b61e4e02866aa66929982d434dadbc7809ae04935b8f097f77c8e276952f160f81ddf49e701fe1367f28bcc28e3a4e7a463407cafe97ef5f63cbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-cipher) \
mvn(org.codehaus.plexus:plexus-cipher:pom:) \
mvn(org.sonatype.plexus:plexus-cipher) \
mvn(org.sonatype.plexus:plexus-cipher:pom:) \
plexus-cipher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.inject:javax.inject)"

inherit rpm
