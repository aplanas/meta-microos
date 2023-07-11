SUMMARY = "API documentation for jsch-agent-proxy"
DESCRIPTION = "This package provides API documentation for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-javadoc-0.0.7-4.7.noarch.rpm"
RPM_HASH = "aab4884ad5e83e34a224872fc0d7e8fe354d85f1a53cecd36f36fc63f58aa00eb531de4408aedf56e52ecfefdd3b572ba53783e8fbf609d4ecbe3c15f9d87cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-com.jcraft-jsch.agentproxy.core"

inherit rpm
