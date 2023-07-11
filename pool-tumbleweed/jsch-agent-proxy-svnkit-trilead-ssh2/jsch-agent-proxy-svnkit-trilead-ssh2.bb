SUMMARY = "trilead-ssh2 connector for jsch-agent-proxy"
DESCRIPTION = "trilead-ssh2 connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-svnkit-trilead-ssh2-0.0.7-4.7.noarch.rpm"
RPM_HASH = "158daa21d28162b61b8868e9ff8e8b18efd4728b9b9ddd2dcaddc5c814266a13a1c0bf2ab96b792608ee14cdf5f3c1d4fd91557cb5c3124d38fa5ddecb1b1523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-svnkit-trilead-ssh2 \
mvn-com.jcraft-jsch.agentproxy.svnkit-trilead-ssh2 \
mvn-com.jcraft-jsch.agentproxy.svnkit-trilead-ssh2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.trilead-trilead-ssh2"

inherit rpm
