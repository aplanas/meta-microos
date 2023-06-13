SUMMARY = "Java date and time API"
DESCRIPTION = "Joda-Time provides a quality replacement for the Java date \
and time classes. The design allows for multiple calendar \
systems, while still providing a simple API. The 'default' \
calendar is the ISO8601 standard which is used by XML. The \
Gregorian, Julian, Buddhist, Coptic and Ethiopic systems \
are also included, and we welcome further additions. \
Supporting classes include time zone, duration, format \
and parsing."
LICENSE = "Apache-2.0"

PV = "2.10.1"

RPM_NAME = "joda-time-2.10.1-2.6.noarch.rpm"
RPM_HASH = "83dea4b64fdc041d5c4c937d529a00c4950995a7c3404f9bf814c10c6ffce0cbab4af503430461315b79de80780cdbbf2e16e57950e06845a7e78fd97572f361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time \
mvn(joda-time:joda-time) \
mvn(joda-time:joda-time:pom:) \
osgi(joda-time)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
