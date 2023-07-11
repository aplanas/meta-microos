SUMMARY = "API documentation for osgi-service-log"
DESCRIPTION = "This package provides API documentation for osgi-service-log."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-javadoc-1.5.0-1.4.noarch.rpm"
RPM_HASH = "560bdeeb554563ef2b2bebea3d4bf3370812d2f9b1d183d09678aaca281571ae396c09db16cf142c25a7e19b5af3cd0ae41b666fd39e67179f08a325f3b1bab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-log-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
