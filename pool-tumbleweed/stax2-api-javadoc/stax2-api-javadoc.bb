SUMMARY = "API documentation for stax2-api"
DESCRIPTION = "This package contains the API documentation for stax2-api."
LICENSE = "BSD-2-Clause"

PV = "4.2.1"

RPM_NAME = "stax2-api-javadoc-4.2.1-1.1.noarch.rpm"
RPM_HASH = "6029bc2a75a001a1852d81050fdc2981f1c29471f28e180ca057a4361e6d87c1393076df6a0b2eaa6185cbf01cd9e143c9a6f1241da5fbc3099cb53660322ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
