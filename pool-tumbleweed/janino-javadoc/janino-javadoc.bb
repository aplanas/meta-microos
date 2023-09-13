SUMMARY = "API documentation for janino"
DESCRIPTION = "API documentation for janino."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "janino-javadoc-3.1.10-2.1.noarch.rpm"
RPM_HASH = "819f3b06d6eaf001388da66a43b340a1f1363135b1117fa22a9031535ab13776bc02a9a37894d5d916c9425e3200af88baeea625eeb6734698e19051aa091103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "janino-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
