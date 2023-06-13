SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-1.0.24-2.6.noarch.rpm"
RPM_HASH = "8fbf64b407852f45988efbfb4df9cf2ce04dc328c0b4b6afd1d78724f67b6bd4d37bdce97ac514c26f0ca5470edc9734af6f2c320dee53a9366a667ec14f6134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon \
mvn(org.jfree:jcommon) \
mvn(org.jfree:jcommon:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
