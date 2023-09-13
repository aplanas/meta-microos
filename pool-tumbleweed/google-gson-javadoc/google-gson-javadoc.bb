SUMMARY = "API documentation for google-gson"
DESCRIPTION = "This package contains the API documentation for google-gson."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-javadoc-2.8.9-5.1.noarch.rpm"
RPM_HASH = "7e9a6cf112fcab94049e4be2cd90dd0173d247865ea48d8115ff7073fe4201e8eb6edfc692e903e619de605459cfd5f8c5b8d3a8337241918723dcb3bc46031c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
