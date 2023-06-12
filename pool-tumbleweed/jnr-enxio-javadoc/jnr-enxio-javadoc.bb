SUMMARY = "Javadocs for jnr-enxio"
DESCRIPTION = "This package contains the API documentation for jnr-enxio."
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-javadoc-0.32.14-1.1.noarch.rpm"
RPM_HASH = "3a38b2169e4d05f0ee2ed912c4091306b42e741cf73977cf0486b7a35d805d8e1c23a68af7882f909c1ca508879a689778a6212b80c98c3c2f3969c8fcbfc0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
