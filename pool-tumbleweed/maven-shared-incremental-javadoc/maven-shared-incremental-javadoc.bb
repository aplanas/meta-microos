SUMMARY = "API documentation for maven-shared-incremental"
DESCRIPTION = "This package provides API documentation for maven-shared-incremental."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-javadoc-1.1-3.1.noarch.rpm"
RPM_HASH = "69cc0263224ef729ef929343024104df71d78d479ca8faaaced710f33c16ab72dc88f5d2c64f0ca0727e92555c2d3ab3cfc1488a8f2b2eaf68d0188c7bd4dfdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
