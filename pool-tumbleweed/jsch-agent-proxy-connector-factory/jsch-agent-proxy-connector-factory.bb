SUMMARY = "Connector factory for jsch-agent-proxy"
DESCRIPTION = "Connector factory for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-connector-factory-0.0.7-4.7.noarch.rpm"
RPM_HASH = "2f9c8c3ff8dd1ca8127de0970f08aeae70227817adc831e5d457cf11377ca606065bd3885aa703b9c54f8da5a679fed7f3794410685ef1ea35dc4e213b67a8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-connector-factory \
mvn-com.jcraft-jsch.agentproxy.connector-factory \
mvn-com.jcraft-jsch.agentproxy.connector-factory-pom- \
osgi-com.jcraft.jsch.agentproxy.connector-factory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.jcraft-jsch.agentproxy.pageant \
mvn-com.jcraft-jsch.agentproxy.sshagent \
mvn-com.jcraft-jsch.agentproxy.usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-nc"

inherit rpm
