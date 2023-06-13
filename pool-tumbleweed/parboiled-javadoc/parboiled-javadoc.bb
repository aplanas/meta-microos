SUMMARY = "Javadoc for parboiled"
DESCRIPTION = "This package contains javadoc for parboiled."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-javadoc-1.1.6-5.6.noarch.rpm"
RPM_HASH = "1b51ffd8108f08fc5578209e804f1fb38cb425e0c77359ca5dc90e2338e649ff069c42f9f724e621d3d03a1bf64a01fcf9a9306a998c93ee9b7c3b1e0b24f51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parboiled-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
