SUMMARY = "Javadoc for plexus-archiver"
DESCRIPTION = "Javadoc for plexus-archiver."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "plexus-archiver-javadoc-4.2.1-2.9.noarch.rpm"
RPM_HASH = "95258dd3fad9abee4cde86d76ae4486b4524de4610c94cb4404bf9543ea581629f72e5352d53750a3c57384472c83b14b6a75601aaafd3580490078ddc903cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
