SUMMARY = "Bouncy Castle JSSE provider and TLS/DTLS API"
DESCRIPTION = "The Bouncy Castle Java APIs for TLS and DTLS, including a provider for the \
JSSE."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-tls-1.73-1.1.noarch.rpm"
RPM_HASH = "55b53ca7b1d894021e59b1943fff3604fae9ef28ed071d5806fd678e24efd66b0cf1e105d3f04a2fb4e21e61838ebd6d95a83acb731919f3ae1e7e3528c2e526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-tls mvn(org.bouncycastle:bctls-jdk15) mvn(org.bouncycastle:bctls-jdk15:pom:) mvn(org.bouncycastle:bctls-jdk15on) mvn(org.bouncycastle:bctls-jdk15on:pom:) mvn(org.bouncycastle:bctls-jdk15to18) mvn(org.bouncycastle:bctls-jdk15to18:pom:) mvn(org.bouncycastle:bctls-jdk16) mvn(org.bouncycastle:bctls-jdk16:pom:) mvn(org.bouncycastle:bctls-jdk18) mvn(org.bouncycastle:bctls-jdk18:pom:) mvn(org.bouncycastle:bctls-jdk18on) mvn(org.bouncycastle:bctls-jdk18on:pom:) osgi(bctls)"
RDEPENDS:${PN} += "bouncycastle bouncycastle-util java-headless javapackages-filesystem mvn(org.bouncycastle:bcprov-jdk18on) mvn(org.bouncycastle:bcutil-jdk18on)"

inherit rpm
