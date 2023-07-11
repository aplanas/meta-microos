SUMMARY = "Javadoc for kxml"
DESCRIPTION = "API documentation for kxml."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-javadoc-2.3.0-19.10.noarch.rpm"
RPM_HASH = "f1db5008595972304268b90ddff7eaaaa55d9cf4e9bc2946ff4aad7d1bf6a527f3c24470184c75b2a003d32591d3efe2d8b352ab8f745520d91165d4102cfb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
