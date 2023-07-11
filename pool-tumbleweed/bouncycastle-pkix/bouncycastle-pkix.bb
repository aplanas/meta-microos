SUMMARY = "Bouncy Castle PKIX, CMS, EAC, TSP, PKCS, OCSP, CMP, and CRMF APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for CMS, PKCS, EAC, TSP, CMP, CRMF, OCSP, and \
certificate generation. This jar contains APIs for JDK 1.5 to JDK 1.8. The \
APIs can be used in conjunction with a JCE/JCA provider such as the one \
provided with the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-pkix-1.74-1.1.noarch.rpm"
RPM_HASH = "f191fc8c6a5df9c8513e3dbc8cf18fa37eeb98887b330aff0fb04c0730159b5f6c3d119b5f1c5f28103e9b89aa10bff3d3d4222ad639f51828b0d9d586ea34a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-pkix \
mvn-org.bouncycastle-bcpkix-jdk15 \
mvn-org.bouncycastle-bcpkix-jdk15-pom- \
mvn-org.bouncycastle-bcpkix-jdk15on \
mvn-org.bouncycastle-bcpkix-jdk15on-pom- \
mvn-org.bouncycastle-bcpkix-jdk15to18 \
mvn-org.bouncycastle-bcpkix-jdk15to18-pom- \
mvn-org.bouncycastle-bcpkix-jdk16 \
mvn-org.bouncycastle-bcpkix-jdk16-pom- \
mvn-org.bouncycastle-bcpkix-jdk18 \
mvn-org.bouncycastle-bcpkix-jdk18-pom- \
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcpkix-jdk18on-pom- \
osgi-bcpkix"

RDEPENDS:${PN} += "bouncycastle \
bouncycastle-util \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
