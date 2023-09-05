SUMMARY = "API documentation for saxpath"
DESCRIPTION = "This package contains API documentation for saxpath."
LICENSE = "Saxpath"

PV = "1.0"

RPM_NAME = "saxpath-javadoc-1.0-1.1.noarch.rpm"
RPM_HASH = "d24381bc3e0fa32e30fbca88e9069dad6ba2b5f05bf8e7077554d36e44ae9d9128405711fe094ecf25c443439ab9cd5ef54eecd47a8e1be56a0d62e781132800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
