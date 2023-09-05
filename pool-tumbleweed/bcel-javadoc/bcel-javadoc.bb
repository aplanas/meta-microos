SUMMARY = "Javadoc for bcel"
DESCRIPTION = "This package contains the API documentation for bcel."
LICENSE = "Apache-2.0"

PV = "6.7.0"

RPM_NAME = "bcel-javadoc-6.7.0-1.1.noarch.rpm"
RPM_HASH = "7b0cb74ba864a5f0b453ac836420bea2f6ee1de8d53cb54f19fe36cd6584ffb007e9de6f5ded41a5f531c042ad7737ca35e7ee5ba0baba8663018fdee2053bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
