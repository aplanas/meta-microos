SUMMARY = "Javadocs for jnr-enxio"
DESCRIPTION = "This package contains the API documentation for jnr-enxio."
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-javadoc-0.32.14-1.2.noarch.rpm"
RPM_HASH = "8f41c6fa9b3cad184c60f6f0ad0deaa438afb7310415b77a2fa5e831f0b97541f758090e1ee2dfafd2aead8ee604ff4e3421373c054da0b2db3a9b177661ad0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
