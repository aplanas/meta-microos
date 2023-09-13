SUMMARY = "Javadoc for plexus-archiver"
DESCRIPTION = "Javadoc for plexus-archiver."
LICENSE = "Apache-2.0"

PV = "4.8.0"

RPM_NAME = "plexus-archiver-javadoc-4.8.0-1.1.noarch.rpm"
RPM_HASH = "105f0d1cba7fe6382e778c1d5cc594e77ce26779d6b0056c695be777d6d324caeabb3760d2d7c1f336f32e75fd74f648048023c6bf62c404319ea4db337104fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
