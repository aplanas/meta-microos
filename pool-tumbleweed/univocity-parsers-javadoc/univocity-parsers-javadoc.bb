SUMMARY = "Javadoc for univocity-parsers"
DESCRIPTION = "API documentation for univocity-parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-javadoc-2.9.1-1.5.noarch.rpm"
RPM_HASH = "e3207952ca6c11514c4e8e22b9712f5cce7bc1541440313e2964cddddb72c7063f90690af2620e9d082d3f58fe410e8ff95ef5533b88417298ba26994df8b6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "univocity-parsers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
