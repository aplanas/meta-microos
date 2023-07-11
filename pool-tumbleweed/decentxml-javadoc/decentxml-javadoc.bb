SUMMARY = "API documentation for decentxml"
DESCRIPTION = "This package contains the API documentation for decentxml."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "decentxml-javadoc-1.4-4.11.noarch.rpm"
RPM_HASH = "a39e302b980db7d98e4fae9bec3b9e4a322005141edfa917acc86f7f2241dbc67b2b3328a4a242f8f3230e6242cafea2d510223a97e1030f72d679377b7f78dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
