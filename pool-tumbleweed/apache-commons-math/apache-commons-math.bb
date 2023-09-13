SUMMARY = "The Apache Commons Mathematics Library"
DESCRIPTION = "Commons Math is a library of lightweight, self-contained mathematics and \
statistics components addressing the most common problems not available in \
the Java programming language or Commons Lang."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-3.6.1-8.1.noarch.rpm"
RPM_HASH = "546c3fe9a85c75503d7718f713fcae3300419c852fec42bdb9ad8de75f9f6cd1e480bb8bbb7f6ca5f655f990aa5f93798ec7aad183219d71fb47c56eb8da7740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math \
apache-commons-math3 \
mvn-org.apache.commons-commons-math3 \
mvn-org.apache.commons-commons-math3-pom- \
osgi-org.apache.commons.math3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
