SUMMARY = "A CSV library for Java"
DESCRIPTION = "A library for reading and writing CSV files with Java. \
 \
It supports reading and writing with POJOs, Maps and Lists. It also \
has support for deep-mapping and index-based mapping with POJOs."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-2.4.0-5.1.noarch.rpm"
RPM_HASH = "164e487703687aaa64b13050bf75fbcc7b3f4ca81ec197edbb1275b29164aa7633ba4c4d052c1b06a9eeeb7a06b4229df80e28c5fee033d4deaac4dd5187dcce"
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
