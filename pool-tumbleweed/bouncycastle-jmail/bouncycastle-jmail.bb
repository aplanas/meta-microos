SUMMARY = "Bouncy Castle Jakarta S/MIME API"
DESCRIPTION = "The Bouncy Castle Java S/MIME APIs for handling S/MIME protocols. This jar \
contains S/MIME APIs for JDK 1.8 and up. The APIs can be used in conjunction \
with a JCE/JCA provider such as the one provided with the Bouncy Castle \
Cryptography APIs. The Jakarta Mail API and the Jakarta activation framework \
will also be needed."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-jmail-1.74-1.1.noarch.rpm"
RPM_HASH = "d914b79bc7ea05de1a7267147ca818a8071b14c105e427ac77ff5ed1db3d1c3ffc80566c2309b36c6961d27ed6e18d6b0901990358ed41bf913ee1dd92973558"
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
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on"

inherit rpm
