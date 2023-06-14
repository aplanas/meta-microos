SUMMARY = "A collection of general purpose utilities for c3p0"
DESCRIPTION = "Originally part of c3p0, mchange-commons is a set of general purpose \
utilities."
LICENSE = "EPL-1.0 | LGPL-2.0-only"

PV = "0.2.20"

RPM_NAME = "mchange-commons-0.2.20-4.5.noarch.rpm"
RPM_HASH = "711ec478f7d18b7d142723b0ff0c14714c527a9913278f1048dbe5c413c0777ec488055a9332831e4e1f9e495512e67c7a9312f7dd415416821ff5e1f8a2be04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mchange-commons \
mvn-com.mchange-mchange-commons-java \
mvn-com.mchange-mchange-commons-java-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
