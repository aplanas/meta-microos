SUMMARY = "Apache Extras Companion for Apache log4j"
DESCRIPTION = "Apache Extras Companion for Apache log4j is a collection of appenders, \
filters, layouts, and receivers for Apache log4j 1.2"
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-1.2.17.1-3.11.noarch.rpm"
RPM_HASH = "c803f96d2d29ca24640235180b0b1eb202a8963b04a5b4424fdcfa05253cf3804ae3428201ea7f1acaa3eaeb9f49dc4b7a088ffb47b344587a5abd9356782c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras \
mvn-log4j-apache-log4j-extras \
mvn-log4j-apache-log4j-extras-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-log4j-log4j"

inherit rpm
