SUMMARY = "Javadoc for jackson-databind"
DESCRIPTION = "This package contains API documentation for jackson-databind."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.13.4.2"

RPM_NAME = "jackson-databind-javadoc-2.13.4.2-1.2.noarch.rpm"
RPM_HASH = "ab7bdd14da5debdb5efe66aee655e0f9c963b7683caa60838dee2b3307fe7d47b96124f8dfa99ea9ba35efbca907ba077167e4efe87eadb73ab961bb5055286b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
