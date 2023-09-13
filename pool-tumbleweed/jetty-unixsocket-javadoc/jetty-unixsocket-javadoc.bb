SUMMARY = "Javadoc for jetty-unixsocket"
DESCRIPTION = "Javadoc for jetty-unixsocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-unixsocket-javadoc-9.4.51-2.1.noarch.rpm"
RPM_HASH = "2e0b30c767783145075843c8e99d50e81c8c522f27cd84087ca2f2a65eb1a0ecf9cae441d631367cb89d0d5506fb5490d43b60c7fd6cc5687564d74574eab765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
