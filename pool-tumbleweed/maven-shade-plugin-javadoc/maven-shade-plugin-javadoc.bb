SUMMARY = "API documentation for maven-shade-plugin"
DESCRIPTION = "API documentation for maven-shade-plugin."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-shade-plugin-javadoc-3.4.1-1.1.noarch.rpm"
RPM_HASH = "2ad8d607d1de8c4292802a96b633dc0878e99ee893659c0d02199027091dae59de3b3a392afbab47e7e6d4071001289fe8e30162871c368ec360ece70a4596d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
