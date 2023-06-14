SUMMARY = "A CSV library for Java"
DESCRIPTION = "A library for reading and writing CSV files with Java. \
 \
It supports reading and writing with POJOs, Maps and Lists. It also \
has support for deep-mapping and index-based mapping with POJOs."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-2.4.0-4.10.noarch.rpm"
RPM_HASH = "0913da2bfeaf0800c78e2d025c960fd6ca7fc7ea1ac7ddc98d27bd80dfadc600579b344291e523607712034e2b7b7142938b5a7d0c55995eaa573bb15b31e292"
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
