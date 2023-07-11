SUMMARY = "API documentation for xmvn-tools"
DESCRIPTION = "This package provides API documentation for xmvn-tools."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-tools-javadoc-4.2.0-2.2.noarch.rpm"
RPM_HASH = "ad954fadd2aabc6041a7b90896124c7508bf09c904569b3d0637e755c3c67f98fecf579b1143d6af697cbc618e36c6636256244e320b20f16a5719cc5ec359e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
