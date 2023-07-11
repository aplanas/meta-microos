SUMMARY = "Javadoc for jetty-unixsocket"
DESCRIPTION = "Javadoc for jetty-unixsocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-unixsocket-javadoc-9.4.51-1.2.noarch.rpm"
RPM_HASH = "e69dff96d462eb5bc1385570948a3cad0145e494de525f98926447091ddc750c7abcd6fab0e297fdfefb05c361a63d637d4a9581cd751bdfe177f40cb7f7857f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
