SUMMARY = "Javadocs for yecht"
DESCRIPTION = "This package contains the API documentation for yecht."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-javadoc-1.1-1.19.noarch.rpm"
RPM_HASH = "03d9b600a9a7b5fc728a865a2d2262546d4f752050cb64d79232acb4f0199e0a2d78a760152f14949061d44ea16c5598a3c305f29e218f473c214a23fd53c5a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yecht-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm
