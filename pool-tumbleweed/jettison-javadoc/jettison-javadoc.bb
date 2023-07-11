SUMMARY = "Javadocs for jettison"
DESCRIPTION = "This package contains the API documentation for jettison."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-javadoc-1.5.4-1.2.noarch.rpm"
RPM_HASH = "8d74327cbf951ad9bcf327f638b1f709a083e718755655b09b439bb9961c001c88a0ee21daff0cab3d29f5809c50f6cd5456a9c49c0bd3182c71a2426fdc470a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
