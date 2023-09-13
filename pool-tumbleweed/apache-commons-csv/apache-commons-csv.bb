SUMMARY = "A library to read and write files in variations of the Comma Separated Value (CSV) format"
DESCRIPTION = "Commons CSV reads and writes files in variations of the Comma Separated Value (CSV) format."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-1.10.0-2.1.noarch.rpm"
RPM_HASH = "14d9ce3e741b73dfb3391e056ea57792a53ec87081fc075c66d32f230856a1d0ef9346457983fdcf02b20b1be50f61587ddd8110b75a8858c5d1c6cd881c9798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv \
mvn-org.apache.commons-commons-csv \
mvn-org.apache.commons-commons-csv-pom- \
osgi-org.apache.commons.commons-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
