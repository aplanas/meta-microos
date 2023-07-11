SUMMARY = "Javadoc for jetty-websocket"
DESCRIPTION = "Javadoc for jetty-websocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-javadoc-9.4.51-1.2.noarch.rpm"
RPM_HASH = "93a9a780b9b33f38d38219365329e1432fd250d5c133a91c1ea1a201226b11702e3b1a3eba27685e46240ec6b8aa0b65b15c2d3c05989d9d19617fde67a98b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
