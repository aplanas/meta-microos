SUMMARY = "Apache Extras Companion for Apache log4j"
DESCRIPTION = "Apache Extras Companion for Apache log4j is a collection of appenders, \
filters, layouts, and receivers for Apache log4j 1.2"
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-1.2.17.1-3.10.noarch.rpm"
RPM_HASH = "0afec4a8073b8e0e5d36482dd7506228deb735e6c87aa4ed3db33792a51211cb31c48f29f049918cbc8bc5dd929c9a39a2256c43905db46b6de9a6cf0ac2d5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras \
mvn(log4j:apache-log4j-extras) \
mvn(log4j:apache-log4j-extras:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(log4j:log4j)"

inherit rpm
