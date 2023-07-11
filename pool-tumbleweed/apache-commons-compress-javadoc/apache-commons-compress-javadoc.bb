SUMMARY = "API documentation for apache-commons-compress"
DESCRIPTION = "This package provides API documentation for apache-commons-compress."
LICENSE = "Apache-2.0"

PV = "1.21"

RPM_NAME = "apache-commons-compress-javadoc-1.21-2.7.noarch.rpm"
RPM_HASH = "834164385cc130aa0ea5b2c3be0173489d478ee0cece4459a11b15804f67d93459f95b4683b7456ddd1b05937d8ecd6e671abc99ee811b55cea01f83fd4701a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-compress-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
