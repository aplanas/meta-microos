SUMMARY = "Javadoc for maven-filtering"
DESCRIPTION = "This package contains the API documentation for maven-filtering."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-filtering-javadoc-3.2.0-2.8.noarch.rpm"
RPM_HASH = "5753abbc8cae6e890f21f39dd13ec86cfebf32bcb020543c3f84c79f67c1694fca57015ca31d3ed07a980d4bb3cac25d5a6020387ba538128c98cac2a4f48f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
