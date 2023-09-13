SUMMARY = "A Java command line parser"
DESCRIPTION = "JOpt Simple is a Java library for parsing command line options, such as those \
you might pass to an invocation of javac."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-5.0.4-2.1.noarch.rpm"
RPM_HASH = "dd1d2dc0bc012889acdc2a2c32d1162ae9a39b3bccd28d19e5011096b469083e9fb10105651a690888c0da806bbae3c591621d5acf6f08ae0f21e4323bc68b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple-pom- \
osgi-net.sf.jopt-simple.jopt-simple"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
