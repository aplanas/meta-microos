SUMMARY = "API documentation for maven-mapping"
DESCRIPTION = "This package provides API documentation for maven-mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-javadoc-3.0.0-3.10.noarch.rpm"
RPM_HASH = "864c00736b48828883256e91d6086653f5794b3ea6b909ef085e460760a2d27b5e7fa3c201236ef105b02b0a9f1ce85eaf814a5b3918a827285c5ce0b7d65add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
