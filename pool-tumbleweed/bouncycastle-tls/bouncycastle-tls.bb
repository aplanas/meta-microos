SUMMARY = "Bouncy Castle JSSE provider and TLS/DTLS API"
DESCRIPTION = "The Bouncy Castle Java APIs for TLS and DTLS, including a provider for the \
JSSE."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-tls-1.74-1.1.noarch.rpm"
RPM_HASH = "e7c1ecfacd1875e1a6c4c94fce7be5d3789218ed679a70a7a270384e40287e96afa8e2eab79e1482fd4a6e6a90eac75fcd170b42d8832a053f89745fced2e7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-tls \
mvn-org.bouncycastle-bctls-jdk15 \
mvn-org.bouncycastle-bctls-jdk15-pom- \
mvn-org.bouncycastle-bctls-jdk15on \
mvn-org.bouncycastle-bctls-jdk15on-pom- \
mvn-org.bouncycastle-bctls-jdk15to18 \
mvn-org.bouncycastle-bctls-jdk15to18-pom- \
mvn-org.bouncycastle-bctls-jdk16 \
mvn-org.bouncycastle-bctls-jdk16-pom- \
mvn-org.bouncycastle-bctls-jdk18 \
mvn-org.bouncycastle-bctls-jdk18-pom- \
mvn-org.bouncycastle-bctls-jdk18on \
mvn-org.bouncycastle-bctls-jdk18on-pom- \
osgi-bctls"

RDEPENDS:${PN} += "bouncycastle \
bouncycastle-util \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
