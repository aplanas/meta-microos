SUMMARY = "ssh-agent connector for jsch-agent-proxy"
DESCRIPTION = "ssh-agent connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-sshagent-0.0.7-4.7.noarch.rpm"
RPM_HASH = "74f5bf6aae41c8d6a18692cde04b7e39a77512a6a3b17942ace9a25e049c440b4e81e26a1ff042efa2d8c497723321de941d151ed485e1372514c08b0ba07e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-sshagent \
mvn-com.jcraft-jsch.agentproxy.sshagent \
mvn-com.jcraft-jsch.agentproxy.sshagent-pom- \
osgi-com.jcraft.jsch.agentproxy.sshagent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
