SUMMARY = "API documentation for apache-commons-io"
DESCRIPTION = "This package provides API documentation for apache-commons-io."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "apache-commons-io-javadoc-2.11.0-2.4.noarch.rpm"
RPM_HASH = "66565edab4f2a8b6e6515193f53fd88873a4c1d9e49aa4d221cf5e20d518c6ce8474624220c3b34cf23315aa30d1d164d0f93723dd84b593f18baedef1c6cee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
