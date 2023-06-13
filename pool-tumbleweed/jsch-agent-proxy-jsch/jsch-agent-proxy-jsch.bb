SUMMARY = "JSch connector for jsch-agent-proxy"
DESCRIPTION = "JSch connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-jsch-0.0.7-4.6.noarch.rpm"
RPM_HASH = "488584ce2de16f2b8d74e92661ba0f896225b81db249804fe951f3838a580622703cd689c92bd9ad4f6dc2d6b6ad31005f5a5d4a10c4ceb8e31c788750e88342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-jsch \
mvn(com.jcraft:jsch.agentproxy.jsch) \
mvn(com.jcraft:jsch.agentproxy.jsch:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jsch) \
mvn(com.jcraft:jsch.agentproxy.core)"

inherit rpm
