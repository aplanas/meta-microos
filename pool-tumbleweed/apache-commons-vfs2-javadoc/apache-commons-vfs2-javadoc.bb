SUMMARY = "Javadoc for apache-commons-vfs2"
DESCRIPTION = "This package contains javadoc for apache-commons-vfs2."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-javadoc-2.2-1.18.noarch.rpm"
RPM_HASH = "25e631fd918a82b5e108bfe717d512612fc5acfb3d2245f67d21825659462f3a3fdc1e9e80bf8b14913a35ba8bff447b14f6a3e9722b73e7ea3e65f418a6cb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
