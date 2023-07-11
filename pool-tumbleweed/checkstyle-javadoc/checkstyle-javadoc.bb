SUMMARY = "Javadoc for checkstyle"
DESCRIPTION = "API documentation for checkstyle."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0"

RPM_NAME = "checkstyle-javadoc-8.0-4.11.noarch.rpm"
RPM_HASH = "e8d4baf703c7d9ec1920350c9c38c1550ff43fb71bbffc742034ae9f964cb1dda989bfdb5c9af4a75b58bf524208577de105e6370f6fa673d11a577a98711187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkstyle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
