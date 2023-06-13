SUMMARY = "A Java command line parser"
DESCRIPTION = "JOpt Simple is a Java library for parsing command line options, such as those \
you might pass to an invocation of javac."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-5.0.4-1.20.noarch.rpm"
RPM_HASH = "df19322bd1f049dd3a45cfa016c35962113713430b20b6f485d487502b7e3498dc1f00ad1b0733650866958dcaa61113baacb88ff5c9156b57d2bd92403291ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple \
mvn(net.sf.jopt-simple:jopt-simple) \
mvn(net.sf.jopt-simple:jopt-simple:pom:) \
osgi(net.sf.jopt-simple.jopt-simple)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
