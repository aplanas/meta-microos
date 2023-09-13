SUMMARY = "Javadoc for maven-reporting-impl"
DESCRIPTION = "API documentation for maven-reporting-impl."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-javadoc-3.1.0-2.1.noarch.rpm"
RPM_HASH = "d52f86e45085bd14d84d41a46f8efb6ac065cda6f775a4f47c4c4d6e3f2541c27835f6d31a48601043d5979d5e2b3970067f03bc2a6dea2add18a7bade3bf05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
