SUMMARY = "Javadocs for nailgun"
DESCRIPTION = "This package contains the API documentation for nailgun."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "nailgun-javadoc-0.9.1-3.11.noarch.rpm"
RPM_HASH = "eb42aa3c46759f05ae2c75f0775ace363ab21de274a1317eb3428a8abe89c556c77568f948cea130cf42f6aaa669dad1eba2280f710621c232a8413ef4661077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nailgun-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
