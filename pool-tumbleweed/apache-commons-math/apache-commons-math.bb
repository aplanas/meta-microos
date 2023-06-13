SUMMARY = "The Apache Commons Mathematics Library"
DESCRIPTION = "Commons Math is a library of lightweight, self-contained mathematics and \
statistics components addressing the most common problems not available in \
the Java programming language or Commons Lang."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-3.6.1-7.7.noarch.rpm"
RPM_HASH = "e3eafce957cc6b9eeb53f351e37e73d36a2ba91eb178a7e7fed28741c2cf910d5442c811bdafe53dc99ebff16ebd69bb27e360f21017cf9afa9832d417382ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math \
apache-commons-math3 \
mvn(org.apache.commons:commons-math3) \
mvn(org.apache.commons:commons-math3:pom:) \
osgi(org.apache.commons.math3)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
