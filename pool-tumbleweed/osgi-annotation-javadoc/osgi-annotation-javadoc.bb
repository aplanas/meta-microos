SUMMARY = "API documentation for osgi-annotation"
DESCRIPTION = "This package contains the API documentation for osgi-annotation."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-annotation-javadoc-7.0.0-3.4.noarch.rpm"
RPM_HASH = "961cccd9867f21716dfdb49c4420af7183a823ee7a61411fafe4ca49db3904c298fa59fe1808ac2d2848b40823648b90701f4fb084deb6f183e06aa9cd38ba40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-annotation-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
