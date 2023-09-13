SUMMARY = "API documentation for maven-dependency-analyzer"
DESCRIPTION = "API documentation for maven-dependency-analyzer"
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "maven-dependency-analyzer-javadoc-1.10-4.1.noarch.rpm"
RPM_HASH = "f8e16c95074a4649ec38d73b385c21cc1aaed2cd202fa9389f0ee5e438d327b5f90e3047f80e7d8fbb4728cae086684b941529d75df8f1e13094cff4fcdab9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
