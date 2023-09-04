SUMMARY = "Parent POM for xstream"
DESCRIPTION = "Parent POM for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-parent-1.4.20-2.1.noarch.rpm"
RPM_HASH = "201aed911763bfc5a2cc4c3443a069bdd7f93b35687baf591d064e37d73266a0bb59ad2440cd99b7a3be9db710cb48c0d007a6897cced9bc1dabcb8620cd58d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-parent-pom- \
xstream-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
xstream"

inherit rpm
