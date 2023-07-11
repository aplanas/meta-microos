SUMMARY = "Javadoc for maven-plugin-tools"
DESCRIPTION = "API documentation for maven-plugin-tools."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-javadoc-3.6.0-5.2.noarch.rpm"
RPM_HASH = "828200fb625cd11d61c73f4769d0b84fe7cad60100141ba345e220f7258555baaee9262d659dd97ce64e7b9be752e2bd884d39904bd55002c025d9d929309a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-javadoc \
maven-plugin-tools-javadocs"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
