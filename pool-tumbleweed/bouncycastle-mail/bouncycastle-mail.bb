SUMMARY = "Bouncy Castle S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. The APIs can \
be used in conjunction with a JCE/JCA provider such as the one provided with \
the Bouncy Castle Cryptography APIs. The JavaMail API and the Java activation \
framework will also be needed."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-mail-1.74-1.1.noarch.rpm"
RPM_HASH = "6050de2ee8a55df01deec6b471e83c24de67c5beffaf82c66d88a272544d1080e11bb6091756a0d1d6820f8e05f195b1e88304077f3b6c5e6ad037e4bb13b342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-mail \
mvn-org.bouncycastle-bcmail-jdk15 \
mvn-org.bouncycastle-bcmail-jdk15-pom- \
mvn-org.bouncycastle-bcmail-jdk15on \
mvn-org.bouncycastle-bcmail-jdk15on-pom- \
mvn-org.bouncycastle-bcmail-jdk15to18 \
mvn-org.bouncycastle-bcmail-jdk15to18-pom- \
mvn-org.bouncycastle-bcmail-jdk16 \
mvn-org.bouncycastle-bcmail-jdk16-pom- \
mvn-org.bouncycastle-bcmail-jdk18 \
mvn-org.bouncycastle-bcmail-jdk18-pom- \
mvn-org.bouncycastle-bcmail-jdk18on \
mvn-org.bouncycastle-bcmail-jdk18on-pom- \
osgi-bcmail"

RDEPENDS:${PN} += "bouncycastle \
bouncycastle-pkix \
bouncycastle-util \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
