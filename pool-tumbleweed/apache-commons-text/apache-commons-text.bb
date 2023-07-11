SUMMARY = "A library focused on algorithms working on strings"
DESCRIPTION = "Apache Commons Text is a library focused on algorithms working on strings."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-text-1.10.0-2.3.noarch.rpm"
RPM_HASH = "36d5a6543366bc2448cf9b67ab55e872b53ef7f154304b7d819700471494ec3240ebae77b64c400c4fd65bb7ba4166674ed11897cd46b7dc39a39944b2a8d63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text \
mvn-org.apache.commons-commons-text \
mvn-org.apache.commons-commons-text-pom- \
osgi-org.apache.commons.commons-text"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3"

inherit rpm
