SUMMARY = "Javadoc for apache-log4j-extras"
DESCRIPTION = "This package contains the API documentation for apache-log4j-extras."
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-javadoc-1.2.17.1-3.10.noarch.rpm"
RPM_HASH = "6a2594806dd5ea76d18b7f5bdb7c01229b06b8c107d5c88cf21095e2ce15c553dc08f40ada9c38086a7674f745452a9b720b1aa2f923ab894371d3d2ad4dfb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
