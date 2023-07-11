SUMMARY = "API documentation for apache-commons-net"
DESCRIPTION = "API documentation for apache-commons-net."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "apache-commons-net-javadoc-3.9.0-1.3.noarch.rpm"
RPM_HASH = "91d0388d591df6f98cdeaf0aab29b5a06652219e70141352ba94a5dcc135fadd625d4d099aca82005fb558fae7c17225b03e324bb205033be71193dee5724d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
