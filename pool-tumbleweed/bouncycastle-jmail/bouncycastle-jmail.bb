SUMMARY = "Bouncy Castle Jakarta S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. This jar \
contains S/MIME APIs for JDK 1.8 and up. The APIs can be used in conjunction \
with a JCE/JCA provider such as the one provided with the Bouncy Castle \
Cryptography APIs. The Jakarta Mail API and the Jakarta activation framework \
will also be needed."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-jmail-1.73-1.1.noarch.rpm"
RPM_HASH = "c5cdeb8501c2c5262dd404541bfdf97b990e5d0cf842800ba97cb96b975322217a7a1626c19d8e96c1db3a7bc95081ab7e5617a1a9e37b363a988862f3125e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-jmail \
mvn-org.bouncycastle-bcjmail-jdk15 \
mvn-org.bouncycastle-bcjmail-jdk15-pom- \
mvn-org.bouncycastle-bcjmail-jdk15on \
mvn-org.bouncycastle-bcjmail-jdk15on-pom- \
mvn-org.bouncycastle-bcjmail-jdk15to18 \
mvn-org.bouncycastle-bcjmail-jdk15to18-pom- \
mvn-org.bouncycastle-bcjmail-jdk16 \
mvn-org.bouncycastle-bcjmail-jdk16-pom- \
mvn-org.bouncycastle-bcjmail-jdk18 \
mvn-org.bouncycastle-bcjmail-jdk18-pom- \
mvn-org.bouncycastle-bcjmail-jdk18on \
mvn-org.bouncycastle-bcjmail-jdk18on-pom-"

RDEPENDS:${PN} += "bouncycastle \
bouncycastle-pkix \
bouncycastle-util \
jakarta-activation \
jakarta-mail \
java-headless \
javapackages-filesystem \
mvn-com.sun.mail-jakarta.mail \
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
