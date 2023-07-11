SUMMARY = "JSch connector for jsch-agent-proxy"
DESCRIPTION = "JSch connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-jsch-0.0.7-4.7.noarch.rpm"
RPM_HASH = "b3f05b2c5d5496570bfa3c2fcdbd72b29719ffdb7956cf121eff03ba4b48122909f50e99fbf0265c7856d3789dc59a85ceb74734fe703236300c2635a36148ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-jsch \
mvn-com.jcraft-jsch.agentproxy.jsch \
mvn-com.jcraft-jsch.agentproxy.jsch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
