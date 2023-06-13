SUMMARY = "Javadoc for jcsp"
DESCRIPTION = "This package contains javadoc for jcsp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-javadoc-1.1~rc5-3.10.noarch.rpm"
RPM_HASH = "f55ea2091a445e0b5c56f97ddbe427075c882aac820cf9ca4835f4e2d3b101e5eeab5173be2bff611b597ccf901beeff6463cf98c186c3e49337bb4ea780a06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
