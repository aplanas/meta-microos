SUMMARY = "Resolver subproject of xml-commons"
DESCRIPTION = "Resolver subproject of xml-commons."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-1.2-4.7.noarch.rpm"
RPM_HASH = "72f8911eae8d41c2330f6da83922443d53d7fdb435ac15137be78198d66909423300501d1b6e9f66a680f969821b0e74edf6352ba4992f930190298265e9ff81"
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

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
