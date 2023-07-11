SUMMARY = "Javadoc for maven-plugin-plugin"
DESCRIPTION = "API documentation for maven-plugin-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-plugin-javadoc-3.6.0-5.2.noarch.rpm"
RPM_HASH = "242ed8273f784278d50d205a6dc817cb538083272927595b38e1ca52859a9748bf1099c6cd2b941bc40e47e8278013664cf8a102e1e70edf320c3037b61b0694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
