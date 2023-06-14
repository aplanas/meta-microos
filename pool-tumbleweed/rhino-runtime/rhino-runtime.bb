SUMMARY = "Rhino Runtime"
DESCRIPTION = "Rhino JavaScript runtime jar, excludes tools & JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-runtime-1.7.14-2.4.noarch.rpm"
RPM_HASH = "2e285b7d04ebd3bd2d569b2f924ce9e22df3aa5dc6fa3c73501a6e8b20302135f3e698ebaf9031faa267a64d416350049be0d2cdb74cced4c6961f5aac1ec4ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino-runtime \
mvn-org.mozilla-rhino-runtime-pom- \
osgi-org.mozilla.rhino-runtime \
rhino-runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
