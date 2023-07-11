SUMMARY = "Pageant connector for jsch-agent-proxy"
DESCRIPTION = "Pageant connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-pageant-0.0.7-4.7.noarch.rpm"
RPM_HASH = "9cd188f9babdd55af26382b5df1834ca3e8489b4d4bda11c00d1970caaa71a0c5a390e76ce3f5a47a1299e4e54cb9749f9a195716df17b04f6c4d33a8e2c02bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-pageant \
mvn-com.jcraft-jsch.agentproxy.pageant \
mvn-com.jcraft-jsch.agentproxy.pageant-pom- \
osgi-com.jcraft.jsch.agentproxy.pageant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-platform"

inherit rpm
