SUMMARY = "Javadoc for jboss-logging"
DESCRIPTION = "This package contains the API documentation for jboss-logging."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-javadoc-3.4.1-3.11.noarch.rpm"
RPM_HASH = "82101361ad7744f0e6d397041816dfeaba7a98b3053154097b1a92624810c72a184d3e4c67bdb42102580d859bb1f27b076fee539b286fd4c71d706e5f3b317d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
