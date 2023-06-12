SUMMARY = "Javadoc for maven-invoker-plugin"
DESCRIPTION = "API documentation for maven-invoker-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-invoker-plugin-javadoc-3.2.2-1.9.noarch.rpm"
RPM_HASH = "4f84607d5d729002c287b260a59daa61475bcc6d95383cca00355af7fd79fdb328173010893a87fd5b97b42cfc02c433522dfaa74ff6613144ff852189363f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
