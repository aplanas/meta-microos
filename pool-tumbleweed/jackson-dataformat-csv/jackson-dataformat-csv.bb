SUMMARY = "Support for reading and writing CSV-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson data format module for reading and writing CSV encoded data, either \
as 'raw' data (sequence of String arrays), or via data binding to/from Java \
Objects (POJOs)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-csv-2.13.3-1.7.noarch.rpm"
RPM_HASH = "17ad3c18821f79116bbb4ef0c82a3805d99e16af523f10abded77816cc671ec85faff56a53d30af39fbb314b52f5fc6db7a2180632cc1c01e958823ba43feb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-csv \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-csv) \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-csv:pom:) \
osgi(com.fasterxml.jackson.dataformat.jackson-dataformat-csv)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-annotations) \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind)"

inherit rpm
