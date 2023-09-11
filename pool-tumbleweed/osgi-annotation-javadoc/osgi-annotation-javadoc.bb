SUMMARY = "API documentation for osgi-annotation"
DESCRIPTION = "This package contains the API documentation for osgi-annotation."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "osgi-annotation-javadoc-8.1.0-1.1.noarch.rpm"
RPM_HASH = "9a6e069c0558c6510ee1bd8fbad33ec82ef70fdb159b7b3a8e6cee850221039a9858a27f93093196e1d5b7defbf668b3bc781e77eeda7d87b95b1da432c8d4c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-annotation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
