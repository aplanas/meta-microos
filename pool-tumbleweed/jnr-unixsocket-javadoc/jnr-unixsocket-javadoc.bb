SUMMARY = "Javadocs for jnr-unixsocket"
DESCRIPTION = "This package contains the API documentation for jnr-unixsocket."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-javadoc-0.38.19-1.1.noarch.rpm"
RPM_HASH = "9ca4dc74e697cfeee04cb0bde9d6ba0a051f361343185635e90d41b69d6c2eff081bbd41efef4de3f958cf391be9b19a69fd2823746f25191fb90a85c7ce32e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
