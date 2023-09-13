SUMMARY = "Support for reading and writing CSV-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson data format module for reading and writing CSV encoded data, either \
as 'raw' data (sequence of String arrays), or via data binding to/from Java \
Objects (POJOs)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-csv-2.15.2-2.1.noarch.rpm"
RPM_HASH = "78e2736bc22f505406186c918975d72802765fad3af169fb8514e67e9fec7e839a4af829b202baeac04fea8e8430b1a469e735e62c9897d930543a5ca74714e6"
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
