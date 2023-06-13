SUMMARY = "API documentation for maven-assembly-plugin"
DESCRIPTION = "This package provides API documentation for maven-assembly-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-assembly-plugin-javadoc-3.3.0-2.8.noarch.rpm"
RPM_HASH = "6977d5b0b20fe987ea986861f74168d5b07749d8aa3d68d4db2a10b7fef88b52ecbe30dd9a5953535c47a3b24159d2b24e59bd3964e68d537eb1c5c3b3651381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
