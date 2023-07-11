SUMMARY = "Support for reading and writing CSV-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson data format module for reading and writing CSV encoded data, either \
as 'raw' data (sequence of String arrays), or via data binding to/from Java \
Objects (POJOs)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-csv-2.13.3-1.8.noarch.rpm"
RPM_HASH = "4d94b20effb09e38871f17ebc34890c26459a701d93d2322ed1515caa348b8d5bdbaabd5e5c09f2fcd1538a9a07b8ceabb1d2fd4dc18f8eb2a574abd42156f9f"
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
