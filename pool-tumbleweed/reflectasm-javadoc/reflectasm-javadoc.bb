SUMMARY = "Javadoc for reflectasm"
DESCRIPTION = "This package contains javadoc for reflectasm."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-javadoc-1.11.1-2.1.noarch.rpm"
RPM_HASH = "6edeb6339b1c3f9b916d564ce00142d992e5d32037556e5ad122821c1e8d48d81c3d0efb1c408731c01d10afbe29025b2dbe1cd7dd243f0b907c058ceab9b8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reflectasm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
