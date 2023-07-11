SUMMARY = "Core annotations for Jackson data processor"
DESCRIPTION = "Core annotations used for value types, \
used by Jackson data-binding package."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-annotations-2.13.3-1.4.noarch.rpm"
RPM_HASH = "7859e16e7849b866f51f4437635a118ccf1815cc90820800974a6e57b409cf79c4ce0786d467a18fc3ceb472edb6baec2c8fb240a7253e793bf05ed38d2fb8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-annotations-pom- \
osgi-com.fasterxml.jackson.core.jackson-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
