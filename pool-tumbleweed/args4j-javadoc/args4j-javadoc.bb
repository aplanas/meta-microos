SUMMARY = "API documentation for args4j"
DESCRIPTION = "This package contains the API documentation for args4j."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-javadoc-2.33-2.6.noarch.rpm"
RPM_HASH = "5131ba8d47d9719feaf86549620d9f9aef50a7b08d7f02d61acad0cbe1420a3d834f63d4ba235a550715652f184a50ae490804182b5823f415b318effaaae311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
