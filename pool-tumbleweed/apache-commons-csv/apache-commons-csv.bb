SUMMARY = "A library to read and write files in variations of the Comma Separated Value (CSV) format"
DESCRIPTION = "Commons CSV reads and writes files in variations of the Comma Separated Value (CSV) format."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-1.10.0-1.1.noarch.rpm"
RPM_HASH = "2537d3925063e2f44addfc7417c90b67275b01c150b154323cbdccb1104cb452981da918de451e8c4c2fd622a8b98334882d33934b9997d9afa8d60ed9813d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv \
mvn(org.apache.commons:commons-csv) \
mvn(org.apache.commons:commons-csv:pom:) \
osgi(org.apache.commons.commons-csv)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
