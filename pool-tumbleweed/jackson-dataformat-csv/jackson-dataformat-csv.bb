SUMMARY = "Support for reading and writing CSV-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson data format module for reading and writing CSV encoded data, either \
as 'raw' data (sequence of String arrays), or via data binding to/from Java \
Objects (POJOs)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-csv-2.15.2-1.1.noarch.rpm"
RPM_HASH = "0f3c3fd4f985bb5f17d0721a4fb28c7829e637ce1422a871e51d91892ad3cbd72095764e05bdd98d207afa5f0348683162d05e1598f6ffc42c63e82530ee67cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-csv \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-csv \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-csv-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
