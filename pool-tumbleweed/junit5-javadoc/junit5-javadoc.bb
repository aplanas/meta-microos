SUMMARY = "Javadoc for junit5"
DESCRIPTION = "Junit5 API documentation."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-javadoc-5.8.2-1.9.noarch.rpm"
RPM_HASH = "8c82dbca2ae6b0ac2e7a730b43ef8f1a01073ec5aa980d3e8c13715bc522f34532e7b45f6ef6fdae49991f8eb452370ec7604267bc66d435ac353db1f91ab61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
