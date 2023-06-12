SUMMARY = "Javadoc for maven-deploy-plugin"
DESCRIPTION = "API documentation for maven-deploy-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~M2"

RPM_NAME = "maven-deploy-plugin-javadoc-3.0.0~M2-1.8.noarch.rpm"
RPM_HASH = "b94444f1318cd74d552c0bb5ddce4f23290b6ef242ada406ae62c4534ec38a6f55cb0bae83c5aa9c0da5302a1146da20501921c8a94bf45a88e01cc78c257452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
