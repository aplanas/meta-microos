SUMMARY = "Javadoc for apache-commons-vfs2"
DESCRIPTION = "This package contains javadoc for apache-commons-vfs2."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-javadoc-2.2-1.17.noarch.rpm"
RPM_HASH = "a2d2933b08df1c7edf5b945d32531b1ab9795aa7765712af984679fe851bbe1b5187351b5cf566afafe75d2e11d8be86cff7d990b2e99f5d025c53c52d86034c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
