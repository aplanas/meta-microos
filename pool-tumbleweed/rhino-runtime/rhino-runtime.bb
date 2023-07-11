SUMMARY = "Rhino Runtime"
DESCRIPTION = "Rhino JavaScript runtime jar, excludes tools & JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-runtime-1.7.14-2.5.noarch.rpm"
RPM_HASH = "527ee783dbc2d468cffbad3514f3c68a3dbab80a51a2724bfefc1affd5fdbdabccd043ef06987069d6778284a4b800b533d21ccb9fabad2fcf6a83e940f60dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino-runtime \
mvn-org.mozilla-rhino-runtime-pom- \
osgi-org.mozilla.rhino-runtime \
rhino-runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
