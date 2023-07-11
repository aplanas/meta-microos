SUMMARY = "Javadocs for jboss-websocket-1.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-websocket-1.0-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-javadoc-1.0.0-2.11.noarch.rpm"
RPM_HASH = "c90c21c32af124649cfc743552c4362c17615097c70afac2ebeda19f49fad95082660e1fc952c743cb6fc3f39884f8909e8276d182ae82c105fcbcaaaa90aa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
