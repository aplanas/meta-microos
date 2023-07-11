SUMMARY = "Javadoc for maven-remote-resources-plugin"
DESCRIPTION = "API documentation for maven-remote-resources-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "maven-remote-resources-plugin-javadoc-1.7.0-2.9.noarch.rpm"
RPM_HASH = "c9325dd52c19f98c191161e883a926d72967ddd36db651fddf99779f5e93a785ab860498c240b6504fa4326e664ea81fe4105da490e0a7a2d8573543cd87ae47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-remote-resources-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
