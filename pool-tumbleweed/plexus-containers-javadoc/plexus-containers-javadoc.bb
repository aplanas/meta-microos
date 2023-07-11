SUMMARY = "API documentation for all plexus-containers packages"
DESCRIPTION = "API documentation for all plexus-containers packages."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-javadoc-2.1.1-4.2.noarch.rpm"
RPM_HASH = "40cfea5dc1067551595e14b1bc31466c8ebd9be0107b8e7466f4b723fd7f3432e66d49bfe63b3dbedf57388715d2bd977aae320cf625ed70d1e64849f316c3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-containers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
