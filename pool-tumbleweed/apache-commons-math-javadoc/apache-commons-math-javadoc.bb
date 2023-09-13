SUMMARY = "Javadoc for apache-commons-math"
DESCRIPTION = "This package contains the API documentation for apache-commons-math."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-javadoc-3.6.1-8.1.noarch.rpm"
RPM_HASH = "1b1fae29a1817dc9ac69b56d3bf1c5437adcdeafbe1106f13e72e608bd80bdab823389d07499ded9945aba0a7ed04b7260bc3ec1b7fa5f2ee80ad7b8752dcb91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
