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

RPM_NAME = "joda-time-2.10.1-2.7.noarch.rpm"
RPM_HASH = "2e2db0ea0a45b8141e71d6fedc76bf2c5ebdf601510e3bd40ceb3ba6da85772ae2fac4eeddc8830c946cd4d510b9fb92a1c8b56237fb702f8ff38ba881b09d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time \
mvn-joda-time-joda-time \
mvn-joda-time-joda-time-pom- \
osgi-joda-time"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
