SUMMARY = "Client for ongres-scram"
DESCRIPTION = "This package contains the client for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-client-2.1-2.11.noarch.rpm"
RPM_HASH = "b1f19cf786b8a2e505684f8b27624dc306870edb30372abf3eb0fbf9ad204f246e88cf72bd72fc75121707805e685740149fbf6fb463801e64b6a6d45798b530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.scram-client \
mvn-com.ongres.scram-client-pom- \
ongres-scram-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.scram-common"

inherit rpm
