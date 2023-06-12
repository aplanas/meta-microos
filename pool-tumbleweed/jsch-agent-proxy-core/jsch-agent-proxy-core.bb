SUMMARY = "jsch-agent-proxy core module"
DESCRIPTION = "jsch-agent-proxy core module."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-core-0.0.7-4.6.noarch.rpm"
RPM_HASH = "903cfea20909344fd40ed4416be56e41d667a45ce05201ee7ad24d7590d7e15db796a83ba78e30ed6e151c13630f208458c23af29612a4ec3d6c99bc70e4615e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-core \
mvn(com.jcraft:jsch.agentproxy.core) \
mvn(com.jcraft:jsch.agentproxy.core:pom:) \
osgi(com.jcraft.jsch.agentproxy.core)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
