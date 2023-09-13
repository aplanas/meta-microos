SUMMARY = "API documentation for maven-assembly-plugin"
DESCRIPTION = "This package provides API documentation for maven-assembly-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-assembly-plugin-javadoc-3.6.0-1.1.noarch.rpm"
RPM_HASH = "f467fe08888f8569be9783a4e0f73f43be77fcbae9e3831e3b7c5bf04aa667a9d60fa812b6ed136d741ad9f2d572660de52535acce8dda9a4bdf83220cb3070c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
