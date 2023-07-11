SUMMARY = "API documentation for google-gson"
DESCRIPTION = "This package contains the API documentation for google-gson."
LICENSE = "Apache-2.0"

PV = "2.8.9"

RPM_NAME = "google-gson-javadoc-2.8.9-4.9.noarch.rpm"
RPM_HASH = "b25b27258a30fa941ccfb84775e015ee8956f9bfe43af53f6ad8dfdfcb79f016b3286a672cedf78a4b5c112435a1d5210faab7132250bebfb0ebc8f8a9bfd18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
