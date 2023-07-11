SUMMARY = "Bouncy Castle OpenPGP API"
DESCRIPTION = "The Bouncy Castle Java API for handling the OpenPGP protocol.The APIs can be \
used in conjunction with a JCE/JCA provider such as the one provided with the \
Bouncy Castle Cryptography APIs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-pg-1.74-1.1.noarch.rpm"
RPM_HASH = "7a50fb53775f1281c174fc36e49975e0f4126c8ace2dc35c658c45f3ecffd0aed8d989d58bfec6107cf40ddf5e6e1fe19c183e1d9c7652f3d49b9718ba71a088"
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
