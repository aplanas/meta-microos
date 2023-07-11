SUMMARY = "USocketFactory implementation using JNA"
DESCRIPTION = "USocketFactory implementation using JNA."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-usocket-jna-0.0.7-4.7.noarch.rpm"
RPM_HASH = "470e6547184876d888f67d289641c478ddc27ba0097b30f0db70a04b45a4d6d65662917a4ff5599f36c5744cacd0d0270f0fd31d1d703c043ac068313496c4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-jna \
mvn-com.jcraft-jsch.agentproxy.usocket-jna-pom- \
osgi-com.jcraft.jsch.agentproxy.usocket-jna"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-platform"

inherit rpm
