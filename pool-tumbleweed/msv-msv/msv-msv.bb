SUMMARY = "Multi-Schema Validator Core"
DESCRIPTION = "Multi-Schema Validator Core."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-msv-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "d61ed2184a2a973bc58204f2201ca365af3683cdd09ace365e40d76d72eef091c79c2b7eb9f4b3fadfb163bdff6cc478b56721cb8a6e114e18490007b0ba017a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-msv \
mvn(net.java.dev.msv:msv-core) \
mvn(net.java.dev.msv:msv-core:pom:) \
osgi(net.java.dev.msv.core)"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(isorelax:isorelax) \
mvn(net.java.dev.msv:xsdlib) \
mvn(xml-resolver:xml-resolver)"

inherit rpm
