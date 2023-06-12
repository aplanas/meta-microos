SUMMARY = "Javadoc for javaewah"
DESCRIPTION = "API documentation for javaewah."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "javaewah-javadoc-1.1.6-2.10.noarch.rpm"
RPM_HASH = "4f8292f8ec0e3d51908273d2b627ec9a606f9d0c8dac7b8cf0c171e907e4bb8e3f7e23fb33e057c76ea7590b5f76ca2a871f7bc90137252505aab44aacd3c3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
