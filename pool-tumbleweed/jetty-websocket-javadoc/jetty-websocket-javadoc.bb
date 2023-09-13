SUMMARY = "Javadoc for jetty-websocket"
DESCRIPTION = "Javadoc for jetty-websocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-javadoc-9.4.51-2.1.noarch.rpm"
RPM_HASH = "dbc54b57f8d3fb924f7a3c0d111c3adb61d8508f52d0aa11a6f4fdc0e3a304c14ef039caf670761796f1110f21e5768dddb1610d689a096ba1e4003ab9eac9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
