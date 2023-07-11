SUMMARY = "Javadoc for slf4j"
DESCRIPTION = "API documentation for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-javadoc-1.7.36-4.2.noarch.rpm"
RPM_HASH = "6e2cf4f96bd4fa7bb8d43b6ae66e7f2baf9f505e06f90ed3ddde6ffe89e453ab47d7af28caf8b78367d2b89a3615b5b670a5d06d30ccd8ee93498e9050e6d45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
