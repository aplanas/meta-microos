SUMMARY = "Java library for conversion to and from standard string formats"
DESCRIPTION = "Java library to enable conversion to and from standard string formats."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "joda-convert-1.9.2-3.6.noarch.rpm"
RPM_HASH = "1d3a3d58e9c324b524bc869f6fe3cce4e0df7335a3c846aed6825c9bc3906f5fa314b7f9f5649efaa119caedda7c1d138fdf387f14d978db07981163b43a2e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert \
mvn(org.joda:joda-convert) \
mvn(org.joda:joda-convert:pom:) \
osgi(org.joda.convert)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
