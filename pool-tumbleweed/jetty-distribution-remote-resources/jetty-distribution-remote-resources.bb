SUMMARY = "Jetty toolchain artifact for distribution remote resources"
DESCRIPTION = "Jetty toolchain artifact for distribution remote distribution resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-distribution-remote-resources-1.2-2.11.noarch.rpm"
RPM_HASH = "c0e696b223ddc534aaad651821e17298f16b4363e0a7d1a6e53f7134f5deadcc10581b551de321e016f9faa4c2973fe52a0c3ce971d4755ddee5fac8a7aaf87e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-distribution-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-distribution-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-distribution-remote-resources-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
