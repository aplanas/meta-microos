SUMMARY = "API documentation for jflex-maven-plugin"
DESCRIPTION = "This package provides API documentation for jflex-maven-plugin."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-maven-plugin-javadoc-1.8.2-1.7.noarch.rpm"
RPM_HASH = "ee9c03a629172fdfe99abe3024eef6428ad2a6a3e58ab0d0d730895a2ade688a0d816704b3ddb3d65b6c9541da68c09b0cef89d093da91eec077e8c3992e9242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
