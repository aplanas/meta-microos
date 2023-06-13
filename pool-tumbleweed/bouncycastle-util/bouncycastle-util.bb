SUMMARY = "Bouncy Castle ASN.1 Extension and Utility APIs"
DESCRIPTION = "The Bouncy Castle Java APIs for ASN.1 extension and utility APIs used to \
support bcpkix and bctls."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-util-1.73-1.1.noarch.rpm"
RPM_HASH = "5b3ace3e88b6a762ac0bdc0ddc746327d05816724853168ca5ff60bcffadb9caff24a431e478e976cf7117e67ca4c91ca97ab7eba0d612202685d725d7022e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-util \
mvn(org.bouncycastle:bcutil-jdk15) \
mvn(org.bouncycastle:bcutil-jdk15:pom:) \
mvn(org.bouncycastle:bcutil-jdk15on) \
mvn(org.bouncycastle:bcutil-jdk15on:pom:) \
mvn(org.bouncycastle:bcutil-jdk15to18) \
mvn(org.bouncycastle:bcutil-jdk15to18:pom:) \
mvn(org.bouncycastle:bcutil-jdk16) \
mvn(org.bouncycastle:bcutil-jdk16:pom:) \
mvn(org.bouncycastle:bcutil-jdk18) \
mvn(org.bouncycastle:bcutil-jdk18:pom:) \
mvn(org.bouncycastle:bcutil-jdk18on) \
mvn(org.bouncycastle:bcutil-jdk18on:pom:)"

RDEPENDS:${PN} += "bouncycastle \
java-headless \
javapackages-filesystem \
mvn(org.bouncycastle:bcprov-jdk18on)"

inherit rpm
