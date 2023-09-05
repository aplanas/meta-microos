SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.43.0.0"

RPM_NAME = "sqlite-jdbc-javadoc-3.43.0.0-1.1.noarch.rpm"
RPM_HASH = "ef6014c87ecee9c2b13bad002980d586c4f84b8a402bf81c8cd9b8202a388d3dadc51c27a9abc6db020926f1438d8f66749b59a8334f34bc4e7321ef70065075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
