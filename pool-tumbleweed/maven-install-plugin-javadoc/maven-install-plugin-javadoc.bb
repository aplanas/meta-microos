SUMMARY = "Javadoc for maven-install-plugin"
DESCRIPTION = "API documentation for maven-install-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "maven-install-plugin-javadoc-3.1.1-1.2.noarch.rpm"
RPM_HASH = "a0f46746e5133bcccc9fdebe4294a178d7a95bdbcab3ea386c367ea60b0f3772bd61535e347bbdaa30f2339752216b0bfde7c7802cb438cd334131467434713f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
