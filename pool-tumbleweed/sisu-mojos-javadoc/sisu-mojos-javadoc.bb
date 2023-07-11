SUMMARY = "API documentation for sisu-mojos"
DESCRIPTION = "This package contains API documentation for sisu-mojos."
LICENSE = "EPL-1.0"

PV = "0.3.1"

RPM_NAME = "sisu-mojos-javadoc-0.3.1-1.2.noarch.rpm"
RPM_HASH = "c225b0e9e69cde3ab1710d5dce22e98ba745ccb2577ece6485dbbdfc4e39b70461b2ea1ad8288e842df22cb5199042617bd5ecabe1aff342f39a0bce9739aa33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-mojos-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
