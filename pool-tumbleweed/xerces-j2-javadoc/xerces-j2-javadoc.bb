SUMMARY = "Javadocs for xerces-j2"
DESCRIPTION = "This package contains the API documentation for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-javadoc-2.12.2-2.6.noarch.rpm"
RPM_HASH = "5e92dc90858f47835fa24488044b44abbab2a14492880b490389741c96c720d93f0602db1de6724125cda59fa23251a75b23719589c0dd9b69116118ceb34d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
