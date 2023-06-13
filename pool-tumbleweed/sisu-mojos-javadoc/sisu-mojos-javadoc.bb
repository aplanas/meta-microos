SUMMARY = "API documentation for sisu-mojos"
DESCRIPTION = "This package contains API documentation for sisu-mojos."
LICENSE = "EPL-1.0"

PV = "0.3.1"

RPM_NAME = "sisu-mojos-javadoc-0.3.1-1.1.noarch.rpm"
RPM_HASH = "c0ba64d7652d11e1085cf4612e7eb1b93c45263093a2d4b375ac49adb3e90faaa9d525f1c1162bf342baaea498319703eb262e3d9a80d56c3d7652ec2178793c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-mojos-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
