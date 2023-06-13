SUMMARY = "JavaScript for Java"
DESCRIPTION = "Rhino is an open-source implementation of JavaScript written entirely \
in Java. It is typically embedded into Java applications to provide \
scripting to end users."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-1.7.14-2.4.noarch.rpm"
RPM_HASH = "2d0174e24681810d63e3ffbf47c1bbb335ef348a82905d7e21214ab82092ff94646622f843e45f4eebe353d702d62405b6b32fdd5e9007a6d8b87c520adfcc35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.mozilla:rhino) \
mvn(org.mozilla:rhino:pom:) \
mvn(rhino:js) \
mvn(rhino:js:pom:) \
osgi(org.mozilla.rhino) \
rhino"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
