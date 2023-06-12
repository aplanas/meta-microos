SUMMARY = "Javadoc for replacer"
DESCRIPTION = "This package contains javadoc for replacer."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-javadoc-1.6-3.10.noarch.rpm"
RPM_HASH = "36533d99fc5c4101c3126854b14027cdbbb0b4208089386c82d9bdcf0d7c26bb3060fc54be970cedd289b27d7fe84a54eb3009904a1075a5dd3ecac9c57114dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "replacer-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
