SUMMARY = "API documentation for checker-qual"
DESCRIPTION = "This package provides API documentation for checker-qual."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-javadoc-3.22.0-1.5.noarch.rpm"
RPM_HASH = "7bfe89bc1c5e8195fe9a4dd12b6dd84b4937f8ab5479cd15b2b949c163ef0dcb0d7cb0e45d129687f241ebfe910a9c05db292d03c832bf6b1ca447145a24f512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
