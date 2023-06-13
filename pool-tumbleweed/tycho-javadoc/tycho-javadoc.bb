SUMMARY = "Javadocs for tycho"
DESCRIPTION = "This package contains the API documentation for tycho."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.6.0"

RPM_NAME = "tycho-javadoc-1.6.0-6.6.noarch.rpm"
RPM_HASH = "dbbeeae1cacb2d6bcb43cf7afbb469757ed83f56bed7d59fef1b9f0a4ab44273cbb1d38034ce092316376001f3d7ce2104cc3c7ac5e00ab85078544b2eaa9f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tycho-extras-javadoc \
tycho-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
