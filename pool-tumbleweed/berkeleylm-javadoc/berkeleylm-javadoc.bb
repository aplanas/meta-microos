SUMMARY = "API documentation for berkeleylm"
DESCRIPTION = "This package contains the API documentation for berkeleylm."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "berkeleylm-javadoc-1.1.6-2.6.noarch.rpm"
RPM_HASH = "4cb203a48fd5b3f272f0cc2f6db622a48de60d0978e92cc0f47e85ab2c29a1738b99a7828e2d33cf337a2ae05587d75b3fd03ccf00db44b3effca14990b9c426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleylm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
