SUMMARY = "Javadoc for plexus-archiver"
DESCRIPTION = "Javadoc for plexus-archiver."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "plexus-archiver-javadoc-4.2.1-2.8.noarch.rpm"
RPM_HASH = "07d02740e82e78af47698bc63bec22ea3649886a6c67c50e3e805b56c0e18e05fc6331dcf5ace449526e81faff67f890e64ab7c15f88dfb9561271a0253b55e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
