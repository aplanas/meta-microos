SUMMARY = "USocketFactory implementation using Netcat"
DESCRIPTION = "USocketFactory implementation using Netcat."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-usocket-nc-0.0.7-4.6.noarch.rpm"
RPM_HASH = "f86c88a5e3ee9be3029a583a197fe93646f62422629d9cab1c51432ab099b0c4e237e8e00699995cfef7773b3f97f87f186280960e658aa16e96dedf72586a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc \
mvn-com.jcraft-jsch.agentproxy.usocket-nc-pom- \
osgi-com.jcraft.jsch.agentproxy.usocket-nc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
