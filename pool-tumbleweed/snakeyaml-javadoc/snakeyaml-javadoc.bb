SUMMARY = "API documentation for snakeyaml"
DESCRIPTION = "This package contains API documentation for snakeyaml."
LICENSE = "Apache-2.0"

PV = "1.33"

RPM_NAME = "snakeyaml-javadoc-1.33-1.2.noarch.rpm"
RPM_HASH = "76e0f608d35e0f603e7238d0c7fe5da52ffdde3ff9325e4ef6a740630286b908121b8e5ddb571cbbc5dfc2a59a8a99b6840759e75aaf9c119d1c93971c7db7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "snakeyaml-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
