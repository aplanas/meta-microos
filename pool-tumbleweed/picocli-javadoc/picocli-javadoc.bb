SUMMARY = "Javadoc for picocli"
DESCRIPTION = "This package contains the API documentation for picocli."
LICENSE = "Apache-2.0"

PV = "4.7.5"

RPM_NAME = "picocli-javadoc-4.7.5-1.1.noarch.rpm"
RPM_HASH = "c7facc054049d873a44545ccce00eed75ecdb8d041d9556fb78de6babfc5a37673dc287d98fa035ffd27438307e6bb306b9522605e4f730ae67ac6db441cd1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
