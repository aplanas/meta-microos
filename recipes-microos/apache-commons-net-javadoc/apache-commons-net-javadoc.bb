SUMMARY = "API documentation for apache-commons-net"
DESCRIPTION = "API documentation for apache-commons-net."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "apache-commons-net-javadoc-3.9.0-1.2.noarch.rpm"
RPM_HASH = "eb4320fa037f1307d62ba190541e755e7c7c04b1aca7370354624cf9490c2293ff75dcbe2dca0e887057eb0e547a6a71cd02858ef8dbb7d3b7841c8da1da82d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
