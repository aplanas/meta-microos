SUMMARY = "API documentation for woodstox-core"
DESCRIPTION = "This package contains the API documentation for woodstox-core."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-javadoc-6.2.8-2.1.noarch.rpm"
RPM_HASH = "c187bc35bed11b20f9970e63a5b3f227378d8762ce8c49a9e8e55769839d072837836272a9f6d14d89c66ddc0225eb495a4e346315f027ddbf85f5f215b007d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "woodstox-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
