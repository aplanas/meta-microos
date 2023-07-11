SUMMARY = "Plexus Security Dispatcher Component"
DESCRIPTION = "Plexus Security Dispatcher Component"
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-2.0-3.5.noarch.rpm"
RPM_HASH = "8b6d978a8d9e3f50e13e5a14feccf0c3db52255626bbc97214c28962f983f5dcedc8ee51b859946afd394a52edc59f3916e75ae69382f7887081e6fb6a3c7b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-sec-dispatcher-pom- \
mvn-org.sonatype.plexus-plexus-sec-dispatcher \
mvn-org.sonatype.plexus-plexus-sec-dispatcher-pom- \
plexus-sec-dispatcher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-cipher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.sonatype.plexus-plexus-cipher"

inherit rpm
