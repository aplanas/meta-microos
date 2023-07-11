SUMMARY = "Javadoc for metainf-services"
DESCRIPTION = "This package contains the API documentation for metainf-services."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-javadoc-1.9-1.11.noarch.rpm"
RPM_HASH = "d817f2184413f0656595aebd3be30386436a086361f83325b7f9e36591fd0e1fdf98621a1c4a358d023bbb846e0987a7b16d29f2113f069e4743ad86ffcd6bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
