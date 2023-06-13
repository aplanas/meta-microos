SUMMARY = "API documentation for apache-commons-imaging"
DESCRIPTION = "This package contains the API documentation for apache-commons-imaging."
LICENSE = "Apache-2.0"

PV = "1.0~alpha2"

RPM_NAME = "apache-commons-imaging-javadoc-1.0~alpha2-2.9.noarch.rpm"
RPM_HASH = "8055ce3e6059fdbbce21525d237d2cb43a5ff1d53dd3a0eece99f4a09eac11717ddd4ad28e4933bdd68da684cd2af373b26b6c68ae97b79cf53cd7c046e2c7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
