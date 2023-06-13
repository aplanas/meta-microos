SUMMARY = "trilead-ssh2 connector for jsch-agent-proxy"
DESCRIPTION = "trilead-ssh2 connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-svnkit-trilead-ssh2-0.0.7-4.6.noarch.rpm"
RPM_HASH = "26154fccf1868498c8867779e42eff93c2dd3eaccd283ac23fe58d0c12bbc3b7414dc24e789e1aab86f56321d47bfa126ba9e831eab1a6043b3d686e1b919f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-svnkit-trilead-ssh2 \
mvn(com.jcraft:jsch.agentproxy.svnkit-trilead-ssh2) \
mvn(com.jcraft:jsch.agentproxy.svnkit-trilead-ssh2:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jsch.agentproxy.core) \
mvn(com.trilead:trilead-ssh2)"

inherit rpm
