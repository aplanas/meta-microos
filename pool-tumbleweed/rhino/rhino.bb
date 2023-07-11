SUMMARY = "JavaScript for Java"
DESCRIPTION = "Rhino is an open-source implementation of JavaScript written entirely \
in Java. It is typically embedded into Java applications to provide \
scripting to end users."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-1.7.14-2.5.noarch.rpm"
RPM_HASH = "208415f9775c94bdd01722a9b8709ded9e519b758d9b45742a4ae0fd20de4f5e90d58cdac28a36b54367ce27ea1053f3ef5dabfdb737031c65b5244be49fdea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino \
mvn-org.mozilla-rhino-pom- \
mvn-rhino-js \
mvn-rhino-js-pom- \
osgi-org.mozilla.rhino \
rhino"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
