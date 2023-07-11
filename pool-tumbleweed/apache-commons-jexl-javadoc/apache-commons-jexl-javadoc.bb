SUMMARY = "Javadocs for apache-commons-jexl"
DESCRIPTION = "This package contains the API documentation for apache-commons-jexl."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-jexl-javadoc-2.1.1-2.7.noarch.rpm"
RPM_HASH = "f2abd8d78675798161c676db5dffe3974ee4aae3a1fbb42d00eaedab12d83880caf50ea835ea8a2987eca28f3e02b2cf796ec47653da349e4f7e64d20615df64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jexl-javadoc \
commons-jexl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
