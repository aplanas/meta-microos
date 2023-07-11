SUMMARY = "A Java command line parser"
DESCRIPTION = "JOpt Simple is a Java library for parsing command line options, such as those \
you might pass to an invocation of javac."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-5.0.4-1.21.noarch.rpm"
RPM_HASH = "45b2046be33b3a6cbc2abdf3b5112277a6334e43324f3b336149ea15da4c2aa53eafa48c57a16cafb7ce158ee7c22609c8e371b9ff01440deb68c501343a37b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple \
mvn-net.sf.jopt-simple-jopt-simple-pom- \
osgi-net.sf.jopt-simple.jopt-simple"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
