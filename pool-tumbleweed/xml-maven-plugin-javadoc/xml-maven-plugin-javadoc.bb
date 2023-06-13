SUMMARY = "Javadocs for xml-maven-plugin"
DESCRIPTION = "This package contains the API documentation for xml-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-javadoc-1.0.2-2.10.noarch.rpm"
RPM_HASH = "4e0c208c0b698750361bb1c6c66f4b4dcedefb3ebcd5bcc379603b87b2efffcba6da230170de0d1cb30b767d91a89e7ddd2c3448477ed2c83e41158e7b935e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
