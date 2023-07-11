SUMMARY = "Javadoc for jboss-modules"
DESCRIPTION = "This package contains the API documentation for jboss-modules."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-javadoc-1.5.2-1.21.noarch.rpm"
RPM_HASH = "d4b1cf541fd3fd108152562e7242ee96af03d96f1abdd3c88e690d3e75d922afc384f2400b7a58f07ccec88c02f38cb22d3935c7d9d0cf5c613485e2888b5d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
