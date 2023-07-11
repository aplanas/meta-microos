SUMMARY = "API documentation for joda-convert"
DESCRIPTION = "This package contains the API documentation for joda-convert."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "joda-convert-javadoc-1.9.2-3.7.noarch.rpm"
RPM_HASH = "043f30ad465f2a85a0a35849abe925502fc5d74b80d6b1936b6131ca1f96476ffbcba5ae0335fe62e28acb686deb14215a2d0e3c6f266069899d5e08e821cd4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
