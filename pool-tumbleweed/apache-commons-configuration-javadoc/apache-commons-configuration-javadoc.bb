SUMMARY = "API documentation for apache-commons-configuration"
DESCRIPTION = "API documentation for apache-commons-configuration."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "apache-commons-configuration-javadoc-1.10-4.6.noarch.rpm"
RPM_HASH = "a38acde1991900c864eb2158fdbdcc3e4a51c73dc67400d53a19da437294978b2024f393c3edcb6323b831ad3792484bbf3d2bdb971b3f8cba8eddcae5c409ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-configuration-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
