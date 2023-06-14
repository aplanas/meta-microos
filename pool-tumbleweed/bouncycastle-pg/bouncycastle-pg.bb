SUMMARY = "Bouncy Castle OpenPGP API"
DESCRIPTION = "The Bouncy Castle Java API for handling the OpenPGP protocol.The APIs can be \
used in conjunction with a JCE/JCA provider such as the one provided with the \
Bouncy Castle Cryptography APIs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-pg-1.73-1.1.noarch.rpm"
RPM_HASH = "e3ac9387c45c84f8a92c8a467b145aea51d48fd36d8bb858c9dff29f7240c948b4cafb48c73f4257109cac57e97118e5ce7a194e7d28dc4ff5ef74bec8168a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-pg \
mvn-org.bouncycastle-bcpg-jdk15 \
mvn-org.bouncycastle-bcpg-jdk15-pom- \
mvn-org.bouncycastle-bcpg-jdk15on \
mvn-org.bouncycastle-bcpg-jdk15on-pom- \
mvn-org.bouncycastle-bcpg-jdk15to18 \
mvn-org.bouncycastle-bcpg-jdk15to18-pom- \
mvn-org.bouncycastle-bcpg-jdk16 \
mvn-org.bouncycastle-bcpg-jdk16-pom- \
mvn-org.bouncycastle-bcpg-jdk18 \
mvn-org.bouncycastle-bcpg-jdk18-pom- \
mvn-org.bouncycastle-bcpg-jdk18on \
mvn-org.bouncycastle-bcpg-jdk18on-pom- \
osgi-bcpg"

RDEPENDS:${PN} += "bouncycastle \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on"

inherit rpm
