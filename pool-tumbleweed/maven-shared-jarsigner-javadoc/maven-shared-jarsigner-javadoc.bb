SUMMARY = "API documentation for maven-shared-jarsigner"
DESCRIPTION = "This package provides API documentation for maven-shared-jarsigner."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-javadoc-3.0.0-2.22.noarch.rpm"
RPM_HASH = "7ef515e34abe010b30dcb24314baa61d71a98cd8918c07203b862bc477a8e32df403732701e64e5307c2ccd2264545b6d3a0ed5cef57f0d7ddfc30a0bfa0efe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
