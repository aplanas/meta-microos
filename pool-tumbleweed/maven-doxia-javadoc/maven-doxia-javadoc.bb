SUMMARY = "Javadoc for maven-doxia"
DESCRIPTION = "API documentation for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-javadoc-1.9.1-6.8.noarch.rpm"
RPM_HASH = "a954829675d1319c49b3b095056bca6883fb3e941d9c31dd12629504c09d3e30f66d70f4f9f91e572f280fbea7ac8e0912447d1bad504d4d79db8e0fd0bd7da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
