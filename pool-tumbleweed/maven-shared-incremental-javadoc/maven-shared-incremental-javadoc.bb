SUMMARY = "API documentation for maven-shared-incremental"
DESCRIPTION = "This package provides API documentation for maven-shared-incremental."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-javadoc-1.1-2.13.noarch.rpm"
RPM_HASH = "2351240f507fe3d42fd9c6b83a1123c28b118d1f3ddab5682b849d5d45862fa52a59b66c2260b04bd45efcb7e1ff192c8e108f1da98e81d5468f9cd063db01e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
