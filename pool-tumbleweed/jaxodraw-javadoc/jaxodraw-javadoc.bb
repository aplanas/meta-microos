SUMMARY = "Javadocs for jaxodraw"
DESCRIPTION = "This package contains the API documentation for jaxodraw."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "jaxodraw-javadoc-2.1.0-6.7.noarch.rpm"
RPM_HASH = "73afd32b21c938672eae8bda5eb4e51e69e23b6b2fd03c85d26e7262072c696fb1afbdd0e3c9cb9b6c071324cc11a2eac78a6c4232576c2b25598b9d73a2ee80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-javadoc"

RDEPENDS:${PN} += "javapackages-tools \
jaxodraw"

inherit rpm
