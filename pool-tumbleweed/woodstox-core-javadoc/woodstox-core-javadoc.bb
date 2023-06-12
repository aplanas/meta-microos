SUMMARY = "API documentation for woodstox-core"
DESCRIPTION = "This package contains the API documentation for woodstox-core."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-javadoc-6.2.8-1.8.noarch.rpm"
RPM_HASH = "0eedbb70104d42176161c8be7acb40d8a0dd107744e959386b88d675edefa062fb9bb85d62cfb80e12f7c23752c06d7dea98ac881e96e5af5688926d37923b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "woodstox-core-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
