SUMMARY = "Javadoc for super-csv"
DESCRIPTION = "This package contains javadoc for super-csv."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-javadoc-2.4.0-4.10.noarch.rpm"
RPM_HASH = "43f7c16462aed255cdcc727cd195915bd2dd87a40614c879b5e411564d8fd27cf067178bb1f8fcbbd3f9f5893bb1f8d9690c0fc6447195d4d1da2343f3e8f3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "super-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
