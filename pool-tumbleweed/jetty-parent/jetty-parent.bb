SUMMARY = "Jetty parent POM file"
DESCRIPTION = "Jetty parent POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "25"

RPM_NAME = "jetty-parent-25-1.20.noarch.rpm"
RPM_HASH = "551440e508b1280f49094508240f6314ecf0c4c77f094094721bf5ed47586f1cd8f8a5b920345209601ea5d973c499f7d9dcc103f7b16084186b43739af36be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-parent \
mvn(org.eclipse.jetty:jetty-parent:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
