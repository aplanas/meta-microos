SUMMARY = "OSGi Core API"
DESCRIPTION = "OSGi Core Release 7, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-core-7.0.0-3.4.noarch.rpm"
RPM_HASH = "0c0126b4d7ebe9ce458584fa6e61ea8953798f0a2fb863d8a5a7acf5d23c696c8e8a401955995cdeadfd5faba97664ab05a41b6ba877a953c8330f510dd9b5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.core \
mvn-org.osgi-osgi.core-pom- \
osgi-core \
osgi-osgi.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
