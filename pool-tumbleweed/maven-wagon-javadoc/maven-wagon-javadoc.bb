SUMMARY = "Javadoc for maven-wagon"
DESCRIPTION = "Javadoc for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-javadoc-3.5.3-1.2.noarch.rpm"
RPM_HASH = "ec16f7545bbf3d5175ce4d4d3c9ac4fafe2600235926e067e0c48e70f7f647b5069c3d40283d818ade30800fef361c80227e50a948128a53e6c3a6eae44b4e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
