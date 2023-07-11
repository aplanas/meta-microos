SUMMARY = "Jetty toolchain artifact remote resources"
DESCRIPTION = "Jetty toolchain artifact remote resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-artifact-remote-resources-1.2-2.11.noarch.rpm"
RPM_HASH = "02c6b4df341d689c9a766919f05c46d80e5df69eb078868d0ee2f5e14638964c5fb0f6b20a1150cf19ffff4411fced160b71bb5e01e45000c7981793cb87a0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-artifact-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-artifact-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-artifact-remote-resources-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
