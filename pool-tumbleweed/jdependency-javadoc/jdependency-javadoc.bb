SUMMARY = "API documentation for jdependency"
DESCRIPTION = "API documentation for jdependency."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "jdependency-javadoc-1.2-4.7.noarch.rpm"
RPM_HASH = "d3ce2fc2c1d8e9f6fa46ef764ab00cc67fcd216c359028f52d7abce4b221b81383346abf18d0415023f82b1df077ac1701d03634f3d26db143b1148360fa460f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
