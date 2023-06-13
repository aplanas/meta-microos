SUMMARY = "Javadoc for jackson-jaxrs-providers"
DESCRIPTION = "This package contains API documentation for jackson-jaxrs-providers."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "6ecb4afbb07febc68482b6ed1d901d54d1afcbf2b06365c68f667b6f79ef3546a4f9307c41e802c4fed8934de3c20686fc2c59420fa2eec1f1fbf870bf29c209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
