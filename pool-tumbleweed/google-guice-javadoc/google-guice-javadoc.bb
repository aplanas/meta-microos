SUMMARY = "API documentation for Guice"
DESCRIPTION = "This package provides API documentation for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "google-guice-javadoc-5.1.0-1.2.noarch.rpm"
RPM_HASH = "a3d937c48c5e113cb3ea037fa861f093fbce72def4d66c995d41f9e316763360578fbca0fbdc2aff0a9e09bc1fad73abae4d9a48633c37d0c9979f23d96c025e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
