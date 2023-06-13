SUMMARY = "API documentation for os-maven-plugin"
DESCRIPTION = "This package provides API documentation for os-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-maven-plugin-javadoc-1.7.0-3.8.noarch.rpm"
RPM_HASH = "7455372ed4bf24975e4a02c23966b78a9d25b622bcc35281cb439190e6ff3e069dd3c55a254b7d1d939c9154122f6667ddc15f7beaf69c413f22ac25655617d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
