SUMMARY = "Javadoc for maven-jlink-plugin"
DESCRIPTION = "API documentation for maven-jlink-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jlink-plugin-javadoc-3.0.0~alpha1-2.21.noarch.rpm"
RPM_HASH = "5bb53195b6480a0e01d2fb718af9757ebe6edc813641fd6b1e2de1fe6a93cf746a739c135f3036ef193b704c0a213217659bdb3373659b7c4e607d228e333163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
