SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-javadoc-1.0.24-2.7.noarch.rpm"
RPM_HASH = "798f180bbeb7a23287097d4e69c20f8790a34ba9474b6996cdf939b40e58cbe0d79026be8c4e8aece18f43c037b2363622571522fe289f63f46dc02f4a2aad24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
