SUMMARY = "Javadoc for uncommons-maths"
DESCRIPTION = "This package contains javadoc for uncommons-maths."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-javadoc-1.2.3-1.18.noarch.rpm"
RPM_HASH = "616fcdc08ecac21879718c53de829677b33096af6f473b23c869956f3f11266d2d3bb7a6b52dc1d93079c6d29107366cbb04a5ba9cf047263ab91921f9d07295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uncommons-maths-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
