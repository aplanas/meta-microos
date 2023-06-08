SUMMARY = "API documentation for antlr3"
DESCRIPTION = "API documentation for antlr3."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-javadoc-3.5.3-2.3.noarch.rpm"
RPM_HASH = "de7a4bd2102fa8fafb28a53a81f1f69b025b352c01463facaab4c5cc6044e37aeec42fbec7e0884dae5e8526841e089a1ae113e95a0537878c299f01fbf85dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
