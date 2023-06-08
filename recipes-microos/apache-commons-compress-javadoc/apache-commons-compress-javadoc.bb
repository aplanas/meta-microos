SUMMARY = "API documentation for apache-commons-compress"
DESCRIPTION = "This package provides API documentation for apache-commons-compress."
LICENSE = "Apache-2.0"

PV = "1.21"

RPM_NAME = "apache-commons-compress-javadoc-1.21-2.6.noarch.rpm"
RPM_HASH = "fcba81167edc2d45e3945a8ecd97238e607142083e0a986931c669ac7e8f6b16f9f658ac5a85bfc7cf509895850f45ea789ac3bd9f33cae2b643be62c295d01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-compress-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
