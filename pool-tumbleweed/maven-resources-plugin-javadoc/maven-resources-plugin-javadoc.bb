SUMMARY = "Javadoc for maven-resources-plugin"
DESCRIPTION = "API documentation for maven-resources-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-resources-plugin-javadoc-3.2.0-3.8.noarch.rpm"
RPM_HASH = "792392c702b8be46608d6fe7c2a9b440445cbc98f892853fa7fff3c8998984b77a29cc441470812a839795dd70552ea4353f694ea8d6b52469919b93272c98b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
