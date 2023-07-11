SUMMARY = "The Apache Commons Mathematics Library"
DESCRIPTION = "Commons Math is a library of lightweight, self-contained mathematics and \
statistics components addressing the most common problems not available in \
the Java programming language or Commons Lang."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-3.6.1-7.8.noarch.rpm"
RPM_HASH = "fcde56d2adbd051dad7b141754f7a991c275a1b86c11ca2c8e452e3859202849e32f5f64726daeb3c56fb5851eefda7e2ec40a585f5e61244432e8fbce9a88a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math \
apache-commons-math3 \
mvn-org.apache.commons-commons-math3 \
mvn-org.apache.commons-commons-math3-pom- \
osgi-org.apache.commons.math3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
