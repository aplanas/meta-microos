SUMMARY = "Bouncy Castle ASN.1 Extension and Utility APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for ASN.1 extension and utility APIs used to \
support bcpkix and bctls."
LICENSE = "MIT"

PV = "1.74"

RPM_NAME = "bouncycastle-util-1.74-1.1.noarch.rpm"
RPM_HASH = "945a07ecda35a410a79a6beb8dabea952b05d70ff83e6bf32c7bea26ac77390617369c27c3fa2815a9790a9eb4798381fd715943f50e933e98b9c8272b3a6b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-util \
mvn-org.bouncycastle-bcutil-jdk15 \
mvn-org.bouncycastle-bcutil-jdk15-pom- \
mvn-org.bouncycastle-bcutil-jdk15on \
mvn-org.bouncycastle-bcutil-jdk15on-pom- \
mvn-org.bouncycastle-bcutil-jdk15to18 \
mvn-org.bouncycastle-bcutil-jdk15to18-pom- \
mvn-org.bouncycastle-bcutil-jdk16 \
mvn-org.bouncycastle-bcutil-jdk16-pom- \
mvn-org.bouncycastle-bcutil-jdk18 \
mvn-org.bouncycastle-bcutil-jdk18-pom- \
mvn-org.bouncycastle-bcutil-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on-pom-"

RDEPENDS:${PN} += "bouncycastle \
java-headless \
javapackages-filesystem \
mvn-org.bouncycastle-bcprov-jdk18on"

inherit rpm
