SUMMARY = "jsch-agent-proxy core module"
DESCRIPTION = "jsch-agent-proxy core module."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-core-0.0.7-4.7.noarch.rpm"
RPM_HASH = "7052b4d98296a7fe18e027872fec377c498215a5e59f387102a21a8f8e480a17f1d6d65c6bd4107bd6ba414654cc7c5ccd937542bb621e65e6731d19f984bad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-core \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-com.jcraft-jsch.agentproxy.core-pom- \
osgi-com.jcraft.jsch.agentproxy.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
