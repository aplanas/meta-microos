SUMMARY = "API documentation for woodstox-core"
DESCRIPTION = "This package contains the API documentation for woodstox-core."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-javadoc-6.2.8-1.9.noarch.rpm"
RPM_HASH = "2561580fc1d5f094a57f84e3a5c9bae5024ab20964325bcd84c780664e625b8b1d7760b81feee4c217dd1b3e92b3bd710c8abaa4db137a2ad79c4cb051904914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "woodstox-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
