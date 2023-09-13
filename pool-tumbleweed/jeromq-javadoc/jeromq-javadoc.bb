SUMMARY = "Javadoc for jeromq"
DESCRIPTION = "This package contains the API documentation for jeromq."
LICENSE = "MPL-2.0+"

PV = "0.5.2"

RPM_NAME = "jeromq-javadoc-0.5.2-2.1.noarch.rpm"
RPM_HASH = "63f36fa738f6d219273a7991791c2f2d69480bc14177d3048ca9cf369a62092629e680d6d2f58caab8cbc6712d9285d369004ef679cde3a2801772b42573bc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
