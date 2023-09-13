SUMMARY = "API documentation for sisu-mojos"
DESCRIPTION = "This package contains API documentation for sisu-mojos."
LICENSE = "EPL-1.0"

PV = "0.9.0~M2"

RPM_NAME = "sisu-mojos-javadoc-0.9.0~M2-1.1.noarch.rpm"
RPM_HASH = "37ae2f1d80385b44f437d3d9df88b378c2861ebd5eb3ae4800bbd4789f45205b05520b4514e31a299d4ed419dda8d8f1f1ce25abcccdc596745b7c6a2ca8b6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-mojos-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
