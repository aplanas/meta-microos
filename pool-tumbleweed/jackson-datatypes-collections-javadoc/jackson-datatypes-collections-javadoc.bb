SUMMARY = "Javadoc for jackson-datatypes-collections"
DESCRIPTION = "This package contains API documentation for jackson-datatypes-collections."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatypes-collections-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "a405458c433c934f42bc955c0f3144c6504f18f97dd8119192ca90516d2d65cb25f3d9f16e80ce337e706f2714266b5fa76068151b28970cb5a08922575318f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
