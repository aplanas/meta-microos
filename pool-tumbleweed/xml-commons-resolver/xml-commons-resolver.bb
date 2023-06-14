SUMMARY = "Resolver subproject of xml-commons"
DESCRIPTION = "Resolver subproject of xml-commons."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-1.2-4.6.noarch.rpm"
RPM_HASH = "247cb420382bc24595f8ed009eed3b2400577ca3db3ae737f883b5735a6f16d857775cd7dc11af6d5c9661f77c412bbd01477645c6965f362b1a973732ccb945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xml-commons-resolver \
mvn-xml-resolver-xml-resolver \
mvn-xml-resolver-xml-resolver-pom- \
osgi-org.apache.xml.resolver \
xerces-j2-xml-resolver \
xml-commons \
xml-commons-resolver \
xml-commons-resolver10 \
xml-commons-resolver11 \
xml-commons-resolver12 \
xml-resolver"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
