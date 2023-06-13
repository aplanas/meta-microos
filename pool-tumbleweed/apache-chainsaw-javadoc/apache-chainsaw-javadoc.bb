SUMMARY = "API documentation for apache-chainsaw"
DESCRIPTION = "API documentation for apache-chainsaw."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-javadoc-2.1.0-3.10.noarch.rpm"
RPM_HASH = "c720be974c6d495bbaeb12d32fe67fc4cada541ee4b26a442bb21f1db6f98fd8a2e0fda5ee92a89ada13046d65ee055dd49c34fc9e8b9f73d90408c28bffeb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
