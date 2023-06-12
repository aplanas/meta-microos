SUMMARY = "Shared EPL v1.0 license feature for Eclipse"
DESCRIPTION = "Shared license feature for Eclipse. Other features may consume this \
feature to avoid unnecessary duplication of license boiler plate."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "eclipse-license1-1.0.1-5.5.noarch.rpm"
RPM_HASH = "3dc1e9e59d7bdc14f761d3ce5bc6a9c808bdfac1324505eb8b0227cb7c6083117f7883384e154162fdc9d492829482582648478999ed56c37bc8b9cf0665df91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-license \
eclipse-license1 \
mvn(org.eclipse.license:org.eclipse.license) \
osgi(org.eclipse.license)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
