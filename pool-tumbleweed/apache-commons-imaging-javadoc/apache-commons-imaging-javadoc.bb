SUMMARY = "API documentation for apache-commons-imaging"
DESCRIPTION = "This package contains the API documentation for apache-commons-imaging."
LICENSE = "Apache-2.0"

PV = "1.0~alpha2"

RPM_NAME = "apache-commons-imaging-javadoc-1.0~alpha2-2.10.noarch.rpm"
RPM_HASH = "2c2dbebced0e85b6b668c103aca32b99327d8bd4b98b0dd00fb53a153c798ba195aad6647c43b7b9b6d71b7772f676c8c3f5e491a510c4554abf1c31d4dfd021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
