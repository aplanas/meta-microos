SUMMARY = "A library to read and write files in variations of the Comma Separated Value (CSV) format"
DESCRIPTION = "Commons CSV reads and writes files in variations of the Comma Separated Value (CSV) format."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-1.10.0-1.2.noarch.rpm"
RPM_HASH = "ca9babb67dfa7db0809b14bbec39a3a56466ef4e171809d9bee8740b9195dad99080ad35f7760054557dbf4cf1b3763e2f1a92af45766aac5cf4dcdc3072e847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv \
mvn-org.apache.commons-commons-csv \
mvn-org.apache.commons-commons-csv-pom- \
osgi-org.apache.commons.commons-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
