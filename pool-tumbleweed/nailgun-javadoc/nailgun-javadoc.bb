SUMMARY = "Javadocs for nailgun"
DESCRIPTION = "This package contains the API documentation for nailgun."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "nailgun-javadoc-0.9.1-3.10.noarch.rpm"
RPM_HASH = "3e2d394c10ef3044f5eb410a03d4daa1b2dfea674f9b89d19e69febb2228e1985890721481514ae854e4cb88aee0e8704ad94f6bec55d6737d5c27ad52fc75f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nailgun-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
