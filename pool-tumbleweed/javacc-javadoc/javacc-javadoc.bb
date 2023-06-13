SUMMARY = "Javadoc for javacc"
DESCRIPTION = "This package contains the API documentation for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-javadoc-7.0.11-1.5.noarch.rpm"
RPM_HASH = "d7f40140098eb04763259a10ac8df74688ef393fd2455afba0bac3027577574123ed7799836588ebc23e9c199e974f99454c2c12c8677537e8eb79eb507cde9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
