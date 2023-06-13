SUMMARY = "Javadoc for plexus-component-api"
DESCRIPTION = "API documentation for plexus-component-api."
LICENSE = "Apache-2.0"

PV = "1.0~alpha15"

RPM_NAME = "plexus-component-api-javadoc-1.0~alpha15-2.6.noarch.rpm"
RPM_HASH = "c4256e7052be4db8e072c1872852094ad3ef444e080b5883c97b1682c43708846c783419a1b4e71be86d3f9bf18804ec676542434462c089ca7b9329c9903682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-component-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
