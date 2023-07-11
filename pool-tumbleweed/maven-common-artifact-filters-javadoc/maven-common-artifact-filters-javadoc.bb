SUMMARY = "Javadoc for maven-common-artifact-filters"
DESCRIPTION = "This package contains javadoc for maven-common-artifact-filters."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-common-artifact-filters-javadoc-3.0.1-2.13.noarch.rpm"
RPM_HASH = "6e785b7c12512a08ccfbdc76f147c0f0dc1b74d66fcf4543740c8e44c7be9cc06e13baf4fdc217e256e7c219afc5544124232184904b9986f009b9bebfaf3953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
