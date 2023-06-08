SUMMARY = "Utilities to assist with developing IO functionality"
DESCRIPTION = "Commons-IO contains utility classes, stream implementations, \
file filters, and endian classes. It is a library of utilities \
to assist with developing IO functionality."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "apache-commons-io-2.11.0-2.4.noarch.rpm"
RPM_HASH = "12e1fb16f7123ea4e98c0c7949d7d797d94795a6cd40946b119335d4f6a1e7de4c95a076ccd77e49c856a3f72b83cb6118d1a2a91e0e4e99a30826f7a0243796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io commons-io jakarta-commons-io mvn(commons-io:commons-io) mvn(commons-io:commons-io:pom:) mvn(org.apache.commons:commons-io) mvn(org.apache.commons:commons-io:pom:) osgi(org.apache.commons.io)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
