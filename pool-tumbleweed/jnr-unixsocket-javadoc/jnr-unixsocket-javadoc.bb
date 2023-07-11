SUMMARY = "Javadocs for jnr-unixsocket"
DESCRIPTION = "This package contains the API documentation for jnr-unixsocket."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-javadoc-0.38.19-1.2.noarch.rpm"
RPM_HASH = "1a18aaeb545127b0705728ff0351d8a2ce126cc6e0d52a811d4ed49d6d11a120889dbd64f19c504642174072ed0b97aefd619b04e7ab0eedebf81de7295cad50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
