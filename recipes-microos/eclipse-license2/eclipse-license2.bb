SUMMARY = "Shared EPL v2.0 license feature for Eclipse"
DESCRIPTION = "Shared license feature for Eclipse. Other features may consume this \
feature to avoid unnecessary duplication of license boiler plate."
LICENSE = "EPL-2.0"

PV = "2.0.2"

RPM_NAME = "eclipse-license2-2.0.2-5.5.noarch.rpm"
RPM_HASH = "e706e8a21115737b6641548a3166d3015cd6e19184180f0406afd5900ed057fcda2e94df3df97dd92f6145c52d8d2416ec25a274886e1180022c32ee59ed8893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-license2 \
mvn(org.eclipse.license:org.eclipse.license) \
osgi(org.eclipse.license)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
