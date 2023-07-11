SUMMARY = "USocketFactory implementation using Netcat"
DESCRIPTION = "USocketFactory implementation using Netcat."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-usocket-nc-0.0.7-4.7.noarch.rpm"
RPM_HASH = "e17c5297400f849ecb1d235f5cc8421f3087b17135091ad31b6714d50f73cc7be910503b6f551699ef0a5c06ba18eac902cba55f459a4350bad5caf7b4f39134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc-pom- \
osgi-com.jcraft.jsch.agentproxy.usocket-nc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
