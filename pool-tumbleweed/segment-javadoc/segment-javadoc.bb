SUMMARY = "API documentation for segment"
DESCRIPTION = "This package contains the API documentation for segment."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-javadoc-2.0.1-1.19.noarch.rpm"
RPM_HASH = "bb53f2f6224e489f73021c77811e75da17fa7f027ea05f2e1fb3bd154e71b1e7ae0a584294b0baea015963578177b58e730fa6523986edd029ce5dcf26ccf478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "segment-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
