SUMMARY = "Javadoc for maven-deploy-plugin"
DESCRIPTION = "API documentation for maven-deploy-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~M2"

RPM_NAME = "maven-deploy-plugin-javadoc-3.0.0~M2-1.9.noarch.rpm"
RPM_HASH = "d4345d1eca8c690fc49d4ab7b3d6dd2ceb7d2376a49fd8c2ebafa111aac1712b694ea65a5fbdcb2a849279e289c3e95b3d35f2beda40d84cd2b0108704ee1cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
