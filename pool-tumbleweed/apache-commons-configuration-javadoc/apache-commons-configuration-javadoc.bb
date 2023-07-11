SUMMARY = "API documentation for apache-commons-configuration"
DESCRIPTION = "API documentation for apache-commons-configuration."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "apache-commons-configuration-javadoc-1.10-4.7.noarch.rpm"
RPM_HASH = "42952c4328c0d671e4b35300c0373fcf055286f9e812ddf85f15885dc1124797293c5367437a727c6b25b7198f3d0e5729e68253dda72a7021df1df281203669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-configuration-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
