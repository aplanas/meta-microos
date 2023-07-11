SUMMARY = "A CSV library for Java"
DESCRIPTION = "A library for reading and writing CSV files with Java. \
 \
It supports reading and writing with POJOs, Maps and Lists. It also \
has support for deep-mapping and index-based mapping with POJOs."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-2.4.0-4.11.noarch.rpm"
RPM_HASH = "b062b7105dba5cb6a82a995d353ebaaae006e95f4e21aa5d101674e095471ece05a60c096aa3d85b871ec1531fdd00a7d28297640ba14d6d7fd3ebe5eb45ae8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.supercsv-super-csv \
mvn-net.sf.supercsv-super-csv-java8 \
mvn-net.sf.supercsv-super-csv-java8-pom- \
mvn-net.sf.supercsv-super-csv-parent-pom- \
mvn-net.sf.supercsv-super-csv-pom- \
osgi-net.sf.supercsv.super-csv \
osgi-net.sf.supercsv.super-csv-java8 \
super-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
